package com.ruoyi.web.controller;

import java.util.List;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.system.domain.UserFavorite;
import com.ruoyi.system.service.IUserFavoriteService;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/favorite")
public class FavoriteController extends BaseController {

    @Autowired
    private IUserFavoriteService favoriteService;

    @GetMapping("/list")
    public AjaxResult list() {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        UserFavorite query = new UserFavorite();
        query.setUserId(loginUser.getUserId());
        List<UserFavorite> list = favoriteService.selectFavoriteList(query);
        return success(list);
    }

    @PostMapping
    public AjaxResult add(@RequestBody UserFavorite favorite) {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        favorite.setUserId(loginUser.getUserId());
        favoriteService.insertFavorite(favorite);
        return success();
    }

    @DeleteMapping("/{courseId}")
    public AjaxResult remove(@PathVariable Long courseId) {
        LoginUser loginUser = SecurityUtils.getLoginUser();
        UserFavorite fav = new UserFavorite();
        fav.setUserId(loginUser.getUserId());
        fav.setCourseId(courseId);
        return toAjax(favoriteService.deleteFavoriteByUserIdAndCourseId(fav));
    }
}
