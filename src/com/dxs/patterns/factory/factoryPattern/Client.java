package com.dxs.patterns.factory.factoryPattern;

/**
 * Created by dengxusheng on 2018-01-25.
 */
public class Client {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); //可引入配置文件实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}
