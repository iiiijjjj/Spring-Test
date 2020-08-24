package com.yu.test.bean;

import com.yu.test.domain.User;
import com.yu.test.service.IQuery;

import java.util.ServiceLoader;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/8/24 0024 下午 3:53
 */

public class ServiceLoaderTest {
    public static void main(String[] args) {
        ServiceLoader<IQuery> serviceLoader = ServiceLoader.load(IQuery.class);
        System.out.println(serviceLoader.findFirst());
    }
}
