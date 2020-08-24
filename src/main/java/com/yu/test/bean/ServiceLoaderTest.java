package com.yu.test.bean;

import com.yu.test.domain.User;
import com.yu.test.domain.UserCreator;
import com.yu.test.service.IQuery;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.serviceloader.ServiceLoaderFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/8/24 0024 下午 3:53
 */

public class ServiceLoaderTest {
    public static void main(String[] args) {
        //ServiceLoader的原生用法
        ServiceLoader<IQuery> serviceLoader = ServiceLoader.load(IQuery.class);
        System.out.println(serviceLoader.findFirst());

        //ServiceLoader在Spring中的用法
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/depenency-lookup.xml");
        ServiceLoader<IQuery> serviceLoader1 = (ServiceLoader<IQuery>) context.getBean("query");
        Optional<IQuery> query = serviceLoader1.findFirst();
        System.out.println(query.get().querySomething());

        //直接创建Bean
        AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
        System.out.println(beanFactory.createBean(UserCreator.class).createUser());


    }
}
