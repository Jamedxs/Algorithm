package com.dxs.patterns.factory.simpleFactory;

/**
 * Created by dengxusheng on 2018-01-25.
 */
//饼状图类：具体产品类
public class PieChart implements Chart{
    public PieChart() {
        System.out.println("创建饼状图！");
    }

    public void display() {
        System.out.println("显示饼状图！");
    }
}
