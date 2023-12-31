package com.linzhongyoushenjun.test;

import com.linzhongyoushenjun.beans.factory.config.BeanDefinition;
import com.linzhongyoushenjun.beans.factory.support.DefaultListableBeanFactory;
import com.linzhongyoushenjun.test.beans.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author：WuYongGang
 * @Package：com.linzhongyoushenjun.test
 * @Date：2023/12/31 17:39
 * @Filename：ApiTest
 * @description:
 */
public class ApiTest {
    @Test
    public void test() {
        //1、初始化bean工厂
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2、注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //3、获取bean
        UserService userService =(UserService) beanFactory.getBean("userService", "wyg");
        userService.queryUserInfo();
    }

    @Test
    public void test_cglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"刚哥"});
        System.out.println(obj);
    }

    @Test
    public void test_newInstance() throws InstantiationException, IllegalAccessException {
        UserService userService = UserService.class.newInstance();
        System.out.println("userService = " + userService);
    }

    @Test
    public void test_constructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       Class<UserService> userServiceClass =  UserService.class;
        Constructor<UserService> constructor = userServiceClass.getDeclaredConstructor(String.class);
        UserService userService = constructor.newInstance("刚哥");
        System.out.println("userService = " + userService);
    }

    @Test
    public void test_parameterTypes() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<UserService> beanClass  = UserService.class;
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();

       Constructor constructor = null;
        for (Constructor<?> ctor : declaredConstructors) {
            if(ctor.getParameterTypes().length == 1){
                constructor  = ctor;
            }
        }
        Constructor<UserService> declaredConstructor = beanClass.getDeclaredConstructor(constructor.getParameterTypes());
        UserService userService = declaredConstructor.newInstance("刚哥");
        System.out.println("userService = " + userService);
    }
}
