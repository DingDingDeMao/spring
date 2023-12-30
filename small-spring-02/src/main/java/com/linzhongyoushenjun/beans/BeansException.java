package com.linzhongyoushenjun.beans;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans
 * @Date：2023/12/30 16:39
 * @Filename：BeansException
 * @description:
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
