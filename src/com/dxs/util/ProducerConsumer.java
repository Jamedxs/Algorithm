package com.dxs.util;

import java.util.LinkedList;

public class ProducerConsumer {

	private LinkedList BOX = new LinkedList();
    private int MAX = 5;
    
    public ProducerConsumer() {
    }

    public void start() {
        new Producer().start();
        new Comsumer().start();
    }
	
    class Producer extends Thread {
        public void run() {
            while (true) {
                synchronized (BOX) {
                    try {
                        while (BOX.size() == MAX) {
                            System.out.println("箱子中苹果是满的，请等待。。。");
                            BOX.wait();
                        }
                        Apple apple = new Apple();//
                        if (BOX.add(apple)) {
                            System.out.println("一个人放苹果进入了箱子");
                            Thread.sleep((long) (Math.random() * 3000));
                            BOX.notify();
                        }
                    } catch (InterruptedException ie) {
                        System.out.println("放苹果的人被异常中断了!");
                    }

                }
            }
        }
    }

    class Comsumer extends Thread {
        public void run() {
            while (true) {
                synchronized (BOX) {
                    try {
                        while (BOX.size() == 0) {
                            System.out.println("箱子中没有苹果，请等待。。。");
                            BOX.wait();
                        }
                        BOX.removeLast();
                        System.out.println("爱吃苹果的人从箱子里取出了一个苹果");
                        Thread.sleep((long) (Math.random() * 3000));
                        BOX.notify();
                    } catch (InterruptedException ie) {
                        System.out.println("吃苹果的人被异常中断了!");
                    }

                }
            }

        }
    }
    class Apple{//这是一个苹果对象
    	}
    public static void main(String[] args) {
    	 ProducerConsumer pc = new ProducerConsumer();
         pc.start();
	}
}
