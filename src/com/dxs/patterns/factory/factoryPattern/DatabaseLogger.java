package com.dxs.patterns.factory.factoryPattern;

/**
 * Created by dengxusheng on 2018-01-25.
 */
public class DatabaseLogger implements Logger{
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
