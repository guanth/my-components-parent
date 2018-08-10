package com.gth.loger.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B {
    private final static Logger logger = LoggerFactory.getLogger(B.class);
    public static void BB() {
        logger.info("我是来自B的error测试");
    }
}
