FROM maven:3.9-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY ruoyi-common/pom.xml ruoyi-common/
COPY ruoyi-framework/pom.xml ruoyi-framework/
COPY ruoyi-system/pom.xml ruoyi-system/
COPY ruoyi-admin/pom.xml ruoyi-admin/
COPY ruoyi-quartz/pom.xml ruoyi-quartz/
COPY ruoyi-generator/pom.xml ruoyi-generator/
RUN mvn dependency:go-offline -B
COPY . .
RUN mvn package -DskipTests -pl ruoyi-admin -am

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/ruoyi-admin/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
