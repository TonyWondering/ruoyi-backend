-- 课程管理菜单
INSERT INTO sys_menu (menu_name, parent_id, order_num, path, component, menu_type, visible, status, perms, icon, create_by, create_time)
VALUES ('课程管理', 1, 10, 'course', 'system/course/index', 'C', '0', '0', 'system:course:list', 'education', 'admin', NOW());

SELECT @menuId := LAST_INSERT_ID();

INSERT INTO sys_menu (menu_name, parent_id, order_num, path, menu_type, visible, status, perms, icon, create_by, create_time)
VALUES ('课程查询', @menuId, 1, '#', 'F', '0', '0', 'system:course:query', '#', 'admin', NOW());
INSERT INTO sys_menu (menu_name, parent_id, order_num, path, menu_type, visible, status, perms, icon, create_by, create_time)
VALUES ('课程新增', @menuId, 2, '#', 'F', '0', '0', 'system:course:add', '#', 'admin', NOW());
INSERT INTO sys_menu (menu_name, parent_id, order_num, path, menu_type, visible, status, perms, icon, create_by, create_time)
VALUES ('课程修改', @menuId, 3, '#', 'F', '0', '0', 'system:course:edit', '#', 'admin', NOW());
INSERT INTO sys_menu (menu_name, parent_id, order_num, path, menu_type, visible, status, perms, icon, create_by, create_time)
VALUES ('课程删除', @menuId, 4, '#', 'F', '0', '0', 'system:course:remove', '#', 'admin', NOW());
