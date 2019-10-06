package com.jwt.redis.controller;

import com.jwt.redis.accessctro.RoleContro;
import com.jwt.redis.enums.RoleEnum;
import com.jwt.redis.util.RandomUtil;
import com.jwt.redis.util.RedisUtil;
import com.jwt.redis.util.ResultVOUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: zty
 * @date 2019/10/6 下午1:33
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("code")
@Api(tags = "验证码生成接口")
@CrossOrigin
public class SecurityCodeController {
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/getCode")
    @ApiOperation("获取验证码")
    @RoleContro(role = RoleEnum.ADMIN)
    public Object getCode(@RequestParam String username){
        String optCode = String.valueOf(RandomUtil.returnCode());
        redisUtil.set(username,optCode,120);
        //这里由于没有用短信发送　为了获取验证码是多少　我们打印到控制台
        log.info(optCode);
        return ResultVOUtil.success(optCode);
    }
}
