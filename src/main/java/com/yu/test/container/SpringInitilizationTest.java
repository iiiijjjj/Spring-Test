package com.yu.test.container;

import com.yu.test.repository.DefaultUserRepository;
import com.yu.test.repository.UserRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.lang.annotation.Annotation;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/8/24 0024 下午 7:36
 */

@Configuration
//@ComponentScan("com.yu.test.repository")
public class SpringInitilizationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringInitilizationTest.class);
        BeanDefinition definition = context.getBeanDefinition("userRepository");
        definition.setInitMethodName("initByMaunalApi");
        System.out.println("xxx");
        context.getBean("userRepository");
    }

    @Bean(initMethod = "initByBean")
    @Lazy
    public DefaultUserRepository userRepository(){
        return new DefaultUserRepository();
    }
}
