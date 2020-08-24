package com.yu.test;

import com.yu.test.annotation.Supper;
import com.yu.test.domain.User;
import com.yu.test.repository.UserRepository;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class DependecyLookup {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("classpath:META-INF/depenency-lookup.xml");
        //实时查找
        User user = beanFactory.getBean("user",User.class);
        System.out.println(user);

        //延迟查找
        ObjectFactory objectFactory = beanFactory.getBean("objectFactory", ObjectFactory.class);
        User user1 = (User) objectFactory.getObject();

        System.out.println(user == user1);

        System.out.println(beanFactory.getBean(User.class));

        //集合查找
        if(beanFactory instanceof ListableBeanFactory){
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            System.out.println(listableBeanFactory.getBeansOfType(User.class));
        }
        //注解查找
        System.out.println(beanFactory.getBeansWithAnnotation(Supper.class));

        System.out.println(beanFactory.getBean("userRepository", UserRepository.class).getUsers());

        System.out.println(beanFactory.getBean("userRepository",UserRepository.class).getBeanFactory());

        System.out.println(beanFactory.getBean(Environment.class));

        System.out.println(beanFactory.getBean("userRepository", UserRepository.class).getObjectFactory().getObject());
    }
}
