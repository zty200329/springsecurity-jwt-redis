package com.jwt.redis.controller;

import com.jwt.redis.accessctro.RoleContro;
import com.jwt.redis.enums.RoleEnum;
import com.jwt.redis.form.LoginForm;
import com.jwt.redis.service.UserService;
import com.jwt.redis.util.RandomUtil;
import com.jwt.redis.util.RedisUtil;
import com.jwt.redis.util.ResultVOUtil;
import com.jwt.redis.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @author: zty
 * @date 2019/9/6 上午10:37
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/anon")
@Api(tags = "登录接口")
@CrossOrigin
public class AnonController {

    @Autowired
    private UserService userService;

    @ApiOperation("登录")
    @PostMapping("/login")
    public ResultVO login(@Valid LoginForm loginForm, HttpServletResponse response) {
        return userService.login(loginForm, response);
    }
}
