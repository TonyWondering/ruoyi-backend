package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.domain.UserFavorite;
import com.ruoyi.system.mapper.UserFavoriteMapper;
import com.ruoyi.system.service.IUserFavoriteService;

@Service
public class UserFavoriteServiceImpl implements IUserFavoriteService {

    @Autowired
    private UserFavoriteMapper favoriteMapper;

    @Override
    public List<UserFavorite> selectFavoriteList(UserFavorite favorite) {
        return favoriteMapper.selectFavoriteList(favorite);
    }

    @Override
    public int insertFavorite(UserFavorite favorite) {
        return favoriteMapper.insertFavorite(favorite);
    }

    @Override
    public int deleteFavoriteByUserIdAndCourseId(UserFavorite favorite) {
        return favoriteMapper.deleteFavoriteByUserIdAndCourseId(favorite);
    }
}
