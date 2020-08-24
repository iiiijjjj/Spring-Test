package com.yu.test.container;

import com.yu.test.domain.User;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class SpringContainerTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        System.out.println(beanDefinitionReader.loadBeanDefinitions("classpath:META-INFO/depenency-lookup.xml"));
        System.out.println(beanFactory.getBean(User.class));
    }
}
