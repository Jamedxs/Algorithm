package com.dxs.patterns.factory.simpleFactory;

/**
 * Created by dengxusheng on 2018-01-25.
 */
//柱状图类：具体产品类
public class HistogramChart implements Chart{
    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    public void display() {
        System.out.println("显示柱状图！");
    }
}
