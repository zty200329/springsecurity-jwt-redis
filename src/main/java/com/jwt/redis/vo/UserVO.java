package com.jwt.redis.vo;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * @author: zty
 * @date 2019/10/5 下午2:39
 * @description:
 */
public class UserVO {
    @NotNull(message = "不能为空")
    @ApiModelProperty("成员名称")
    private String username;

    @NotNull(message = "不能为空")
    private Integer role;
}
