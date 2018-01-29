package com.dxs.patterns.factory.factoryPattern;

/**
 * Created by dengxusheng on 2018-01-25.
 */
//文件日志记录器：具体产品
public class FileLogger implements Logger{
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
