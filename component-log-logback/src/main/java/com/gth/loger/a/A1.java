package com.gth.loger.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A1 {

    private final static Logger logger = LoggerFactory.getLogger(A1.class);
    public static void AA() {
        logger.info("我是来自A1的info测试");
    }
}
