package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.UserFavorite;

public interface UserFavoriteMapper {
    List<UserFavorite> selectFavoriteList(UserFavorite favorite);
    int insertFavorite(UserFavorite favorite);
    int deleteFavorite(Long favoriteId);
    int deleteFavoriteByUserIdAndCourseId(UserFavorite favorite);
}
