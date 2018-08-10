package com.gth.loger.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A {

    private final static Logger logger = LoggerFactory.getLogger(A.class);
    public static void AA() {
        logger.info("我是来自A的error测试");
    }
}
