package com.linzhongyoushenjun.beans;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans
 * @Date：2024/1/1 0:15
 * @Filename：BeansException
 * @description:
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg, Throwable cause){
        super(msg, cause);
    }
}
