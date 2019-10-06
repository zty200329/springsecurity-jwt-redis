package com.jwt.redis.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: LZH
 * @date 2019/9/6 上午10:40
 * @description: 登录表单
 */
@Data
public class LoginForm {

    @NotNull(message = "用户名不能为空")
    @ApiModelProperty("用户名")
    private String username;

    @NotNull(message = "密码不能为空")
    @ApiModelProperty("密码")
    private String password;

    @NotNull(message = "验证码不能为空")
    @ApiModelProperty("验证码")
    private Integer securityCode;
}
