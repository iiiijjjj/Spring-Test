package com.yu.test.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/8/24 0024 下午 3:30
 *
 * @mem Bean初始化的测试代码
 */

public class BeanInstanceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/depenency-lookup.xml");
        //调用的是FactoryBean的getObjectType 反射生成的值
        System.out.println(context.getBean("user"));
        //调用的是FactoryBean的getObject的值
        System.out.println(context.getBean("userFactory"));

        System.out.println(context.getBean("user1"));
    }
}
