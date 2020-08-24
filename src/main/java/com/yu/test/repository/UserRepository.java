package com.yu.test.repository;

import com.yu.test.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;

import java.util.Collection;

public class UserRepository {
    private Collection<User> users; //自定义的bean

    private BeanFactory beanFactory;    //内建非bean

    private ObjectFactory<User> objectFactory;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public ObjectFactory<User> getObjectFactory() {
        return objectFactory;
    }

    public void setObjectFactory(ObjectFactory<User> objectFactory) {
        this.objectFactory = objectFactory;
    }
}
