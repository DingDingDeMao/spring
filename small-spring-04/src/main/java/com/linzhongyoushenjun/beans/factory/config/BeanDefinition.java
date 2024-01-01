package com.linzhongyoushenjun.beans.factory.config;

import com.linzhongyoushenjun.beans.PropertyValues;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.beans.factory.config
 * @Date：2024/1/1 0:26
 * @Filename：BeanDefinition
 * @description:
 */
public class BeanDefinition {
    private  Class beanClass;
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues =new  PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
