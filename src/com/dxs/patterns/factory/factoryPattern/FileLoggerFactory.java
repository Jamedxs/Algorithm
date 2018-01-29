package com.dxs.patterns.factory.factoryPattern;

/**
 * Created by dengxusheng on 2018-01-25.
 */
//文件日志记录器工厂类：具体工厂
public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
