package com.kodilla.patterns2.facade.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WatcherFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherFacade.class);

    @Around("execution(* com.kodilla.patterns2.facade.facade.api.OrderFacade.processorOrder(..))")
    public Object measureTimeSuccessfulOrder(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Time to complete yor order:  " + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }

    @Before("execution(* com.kodilla.patterns2.facade.facade.api.OrderFacade.processorOrder(..))" +
            "&& args(orderDto, userId) && target(object)")
    public void logBefore(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() +
                ", Order: " + orderDto + ", UserId: " + userId);
        LOGGER.info("Method started!");
    }

    @AfterReturning("execution(* com.kodilla.patterns2.facade.facade.api.OrderFacade.processorOrder(..))" +
            "&& args(orderDto, userId) && target(object)")
    public void logAfterReturning(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() +
                ", Order: " + orderDto + ", UserId: " + userId);
        LOGGER.info("Method ended without errors!");
    }

    @AfterThrowing("execution(* com.kodilla.patterns2.facade.facade.api.OrderFacade.processorOrder(..))" +
            "&& args(orderDto, userId) && target(object)")
    public void logAfterThrowing(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() +
                ", Order: " + orderDto + ", UserId: " + userId);
        LOGGER.info("Method threw an exception!");
    }

    @After("execution(* com.kodilla.patterns2.facade.facade.api.OrderFacade.processorOrder(..))" +
            "&& args(orderDto, userId) && target(object)")
    public void logAfter(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() +
                ", Order: " + orderDto + ", UserId: " + userId);
        LOGGER.info("Method ended!");
    }
}
