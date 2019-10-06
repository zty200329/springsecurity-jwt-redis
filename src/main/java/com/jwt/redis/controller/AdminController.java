package com.jwt.redis.controller;


import com.jwt.redis.DTO.UserDTO;
import com.jwt.redis.accessctro.RoleContro;
import com.jwt.redis.enums.RoleEnum;
import com.jwt.redis.service.UserService;
import com.jwt.redis.util.RandomUtil;
import com.jwt.redis.util.RedisUtil;
import com.jwt.redis.util.ResultVOUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * @author: zty
 * @date 2019/9/5 下午5:06
 * @description:
 */
@Slf4j
@RequestMapping("/admin")
@RestController
@Api(tags = "注册接口")
@CrossOrigin
public class AdminController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    @ApiOperation("添加用户")
    @RoleContro(role = RoleEnum.ADMIN)
    public Object addUser(UserDTO userDTO) {

        return userService.addUser(userDTO);
    }
}
