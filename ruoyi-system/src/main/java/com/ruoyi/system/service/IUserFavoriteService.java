package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.UserFavorite;

public interface IUserFavoriteService {
    List<UserFavorite> selectFavoriteList(UserFavorite favorite);
    int insertFavorite(UserFavorite favorite);
    int deleteFavoriteByUserIdAndCourseId(UserFavorite favorite);
}
