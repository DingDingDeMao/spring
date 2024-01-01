package com.linzhongyoushenjun.beans.factory.config;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.config
 * @Date：2024/1/1 0:28
 * @Filename：BeanReference
 * @description:
 */
public class BeanReference {
    private String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
