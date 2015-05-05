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
                            System.out.println("箱子中苹果已满，请等待。。");
                            BOX.wait();
                        }
                        Apple apple = new Apple();//
                        if (BOX.add(apple)) {
                            System.out.println("向箱子中放入苹果。。");
                            Thread.sleep((long) (Math.random() * 3000));
                            BOX.notify();
                        }
                    } catch (InterruptedException ie) {
                        System.out.println("生产者生产苹果出现异常!");
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
                            System.out.println("箱子中没有苹果，请等待。。");
                            BOX.wait();
                        }
                        BOX.removeLast();
                        System.out.println("箱子中的苹果被取出。。");
                        Thread.sleep((long) (Math.random() * 3000));
                        BOX.notify();
                    } catch (InterruptedException ie) {
                        System.out.println("消费者吃苹果时出现异常!");
                    }

                }
            }

        }
    }
    class Apple{//����һ��ƻ������
    	}
    public static void main(String[] args) {
    	 ProducerConsumer pc = new ProducerConsumer();
         pc.start();
	}
}
