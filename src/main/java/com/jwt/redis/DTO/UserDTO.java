package com.jwt.redis.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author: zty
 * @date 2019/9/5 下午4:42
 * @description:
 */

@Data
public class UserDTO {

    @NotNull(message = "不能为空")
    @ApiModelProperty("成员名称")
    private String username;

    @NotNull(message = "不能为空")
    @ApiModelProperty("权限")
    private Integer role;

    @NotNull(message = "不能为空")
    @ApiModelProperty("密码")
    private String password;

    @NotNull(message = "验证码不能为空")
    @ApiModelProperty("验证码" +
            "")
    private Integer securityCode;
}
