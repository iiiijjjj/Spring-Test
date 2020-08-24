package com.yu.test.repository;

import org.springframework.aop.framework.AbstractAdvisingBeanPostProcessor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/8/24 0024 下午 7:33
 */

@Component("default-repository")
public class DefaultUserRepository implements InitializingBean {

    @PostConstruct
    public void init(){
        System.out.println("from @PostConstruct");
    }

    public void initByBean(){
        System.out.println("from @Bean");
    }

    public void initByMaunalApi(){
        System.out.println("from setInitMethodName()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("from InitializingBean");
    }
}
