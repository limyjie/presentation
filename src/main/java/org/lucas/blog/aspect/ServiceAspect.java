/**
 * Author: lin
 * Date: 2019/3/10 12:14
 */
package org.lucas.blog.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
public class ServiceAspect {

    private static Logger logger = Logger.getLogger(ServiceAspect.class.getCanonicalName());

    // ResponseObject org.lucas.blog.service.IndexPageService.*
    @Pointcut("execution(public org.lucas.blog.utils.ResponseObject org.lucas.blog.service.IndexPageService.*(..))")
    public void pointCut(){}


    @AfterReturning(returning = "returnValue",pointcut = "pointCut()")
    public void afterCall(JoinPoint joinPoint,Object returnValue){
        logger.log(Level.WARNING,"---------------");
        logger.log(Level.WARNING,returnValue.toString());
        logger.log(Level.WARNING,"---------------");
    }

}
