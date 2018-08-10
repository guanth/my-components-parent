package com.gth;

import com.gth.loger.a.A;
import com.gth.loger.a.A1;
import com.gth.loger.b.B;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlogAction{
     //定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(BlogAction.class);

    public static void main(String[] args) {
        logger.info("logback 成功了");
        logger.error("logback 成功了");
//        System.err.println("123");

        A.AA();
        B.BB();
        A1.AA();
    }
}