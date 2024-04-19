package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @ClassName: UserService
 * @Description: TODO(一句话描述该类的功能)
 * @DateTime: 2024/4/19
 **/
public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
