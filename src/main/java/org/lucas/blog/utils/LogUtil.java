/**
 * Author: lin
 * Date: 2019/3/21 10:55
 */
package org.lucas.blog.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogUtil {

    private static volatile Logger logger ;

    private LogUtil(){
    }

    public static void log(Object sourceObject,String msg){
        if(logger==null){
            synchronized (LogUtil.class){
                if(logger==null){
                    logger = Logger.getLogger(LogUtil.class.getSimpleName());
                }
            }
        }
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        logger.log(Level.WARNING,
                sourceObject.getClass().getSimpleName()+" "+methodName+": " +msg);
    }

}
