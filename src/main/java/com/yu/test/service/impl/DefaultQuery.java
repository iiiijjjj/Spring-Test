package com.yu.test.service.impl;

import com.yu.test.service.IQuery;

/**
 * @author YULY
 * @version 1.0
 * @date 2020/8/24 0024 下午 3:56
 */

public class DefaultQuery implements IQuery {
    @Override
    public String querySomething() {
        return "query successfully";
    }
}
