package com.yu.test.bean;

import com.yu.test.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/8/24 0024 下午 12:48
 */

@Import(User.class)
public class BeanRegisterTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanRegisterTest.class);
        context.registerBean(User.class);
        User user = context.getBean(User.class);

        BeanDefinitionRegistry registry = context;

        GenericBeanDefinition beanDefinition1 = new GenericBeanDefinition();
        beanDefinition1.setBeanClass(User.class);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("id",1L);
        propertyValues.addPropertyValue("name","yuly");
        beanDefinition1.setPropertyValues(propertyValues);
        //registry.registerBeanDefinition("user",beanDefinition1);

        BeanDefinitionHolder holder = new BeanDefinitionHolder(beanDefinition1,"xxx");
        BeanDefinitionReaderUtils.registerBeanDefinition(holder,context.getDefaultListableBeanFactory());

        AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(context);
        reader.register(User.class);


        System.out.println(user);

    }

    @Bean
    public User user(){
        User user = new User();
        user.setName("yuly");
        user.setId(1L);
        return user;
    }

}
