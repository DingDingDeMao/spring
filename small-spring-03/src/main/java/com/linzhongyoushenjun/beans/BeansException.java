package com.linzhongyoushenjun.beans;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans
 * @Date：2023/12/31 16:08
 * @Filename：BeanException
 * @description:
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg){
        super(msg);
    }
    public BeansException(String msg, Throwable cause){
        super(msg,cause);
    }
}
