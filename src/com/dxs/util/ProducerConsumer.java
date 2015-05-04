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
                            System.out.println("������ƻ�������ģ���ȴ�������");
                            BOX.wait();
                        }
                        Apple apple = new Apple();//
                        if (BOX.add(apple)) {
                            System.out.println("һ���˷�ƻ������������");
                            Thread.sleep((long) (Math.random() * 3000));
                            BOX.notify();
                        }
                    } catch (InterruptedException ie) {
                        System.out.println("��ƻ�����˱��쳣�ж���!");
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
                            System.out.println("������û��ƻ������ȴ�������");
                            BOX.wait();
                        }
                        BOX.removeLast();
                        System.out.println("����ƻ�����˴�������ȡ����һ��ƻ��");
                        Thread.sleep((long) (Math.random() * 3000));
                        BOX.notify();
                    } catch (InterruptedException ie) {
                        System.out.println("��ƻ�����˱��쳣�ж���!");
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
