package com.yu.test.container;

import com.yu.test.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringAnnotationContainerTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringAnnotationContainerTest.class);
        context.refresh();
        System.out.println(context.getBean("user"));
        System.out.println(context.getBean("user",2L,"yuly"));
        System.out.println(context.getBean("user"));
    }

    @Bean
    public User user(){
        User user = new User();
        user.setId(12L);
        user.setName("xxx");
        return user;
    }
}
