package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 用户自定义的前置增强
 */
public class MyBeforeAdvice {
    private static final Logger logger = LoggerFactory.getLogger(MyBeforeAdvice.class);

    //    定义前置方法
    public void beforeMethod() {
        logger.debug("This is a before by mengcai.");
        logger.info("This is a before by caimeng");
//        System.out.println("This is a before method.");
    }

}
