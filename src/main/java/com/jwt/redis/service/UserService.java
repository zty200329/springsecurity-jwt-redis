package com.jwt.redis.service;

import com.jwt.redis.DTO.UserDTO;
import com.jwt.redis.entity.User;
import com.jwt.redis.form.LoginForm;
import com.jwt.redis.vo.ResultVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: LZH
 * @date 2019/9/5 下午4:40
 * @description: 用户逻辑层
 */

public interface UserService {

    /**
     * 添加用户
     * @param userDTO
     * @return
     */
    ResultVO addUser(UserDTO userDTO);

    /**
     * 获取当前用户
     * @return
     */
    User getCurrentUser();

    /**
     * 通过用户名获取用户
     * @param userName
     * @return
     */
    User getUserByUsername(String userName);


    ResultVO login(LoginForm loginForm, HttpServletResponse response);


}
