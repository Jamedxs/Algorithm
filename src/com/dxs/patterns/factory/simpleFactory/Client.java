package com.dxs.patterns.factory.simpleFactory;

/**
 * Created by dengxusheng on 2018-01-25.
 */
public class Client {
    public static void main(String args[]) {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品
        chart.display();
    }
}
