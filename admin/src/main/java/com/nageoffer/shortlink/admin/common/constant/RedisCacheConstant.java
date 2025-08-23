package com.nageoffer.shortlink.admin.common.constant;

/**
 * 短链接后管 Redis 缓存常量类
 */
public class RedisCacheConstant {

    /**
     * 用户注册分布式锁
     */
    public static final String LOCK_USER_register_KEY = "short-link:lock_user_register:";

    /**
     * 用户登录缓存标识
     */
    public static final String USER_LOGIN_KEY = "short-link:login:";
}
