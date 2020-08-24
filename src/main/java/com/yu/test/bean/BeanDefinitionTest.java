package com.yu.test.bean;

import com.yu.test.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class BeanDefinitionTest {
    public static void main(String[] args) {
        //方法一
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
        BeanDefinition beanDefinition = builder.addPropertyValue("id",1L)
                .addPropertyValue("name","yuly")
                .getBeanDefinition();


        //方法二
        GenericBeanDefinition beanDefinition1 = new GenericBeanDefinition();
        beanDefinition1.setBeanClass(User.class);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue("id",1L);
        propertyValues.addPropertyValue("name","yuly");
        beanDefinition1.setPropertyValues(propertyValues);
    }
}
