package com.linzhongyoushenjun;

import com.linzhongyoushenjun.bean.UserDao;
import com.linzhongyoushenjun.bean.UserService;
import com.linzhongyoushenjun.beans.PropertyValue;
import com.linzhongyoushenjun.beans.PropertyValues;
import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;
import com.linzhongyoushenjun.beans.factory.config.BeanReference;
import com.linzhongyoushenjun.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun
 * @Date：2024/1/1 20:38
 * @Filename：ApiTest
 * @description:
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        //1、实例化bean
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2、注册dao
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10002"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        //4. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //5. 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        UserDao userDao = userService.getUserDao();
        userDao.queryUserName("1");
    }
}
