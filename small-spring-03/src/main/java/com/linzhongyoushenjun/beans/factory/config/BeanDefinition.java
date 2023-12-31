package com.linzhongyoushenjun.beans.factory.config;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.config
 * @Date：2023/12/31 16:01
 * @Filename：BeanDefinition
 * @description:
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
