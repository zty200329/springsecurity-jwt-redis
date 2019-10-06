package com.jwt.redis.util;

import java.util.Random;

/**
 * @author: zty
 * @date 2019/10/5 下午2:33
 * @description:
 */
public class RandomUtil {
    public static int returnCode(){
        Random rand = new Random();
        return rand.nextInt(89999)+10000;
    }

}
