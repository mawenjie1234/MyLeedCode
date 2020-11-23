package com.company.thread;

import org.w3c.dom.Text;

/**
 * 两个线程交替打印数字
 */
public class AlternatePrintNumber {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new Test1(counter));
        Thread thread2 = new Thread(new Test2(counter));
        thread1.start();
        thread2.start();
    }

    public static class Counter {
        public int value;
        public boolean odd;
    }

    static class Test1 implements Runnable {

        private Counter counter;

        Test1(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            synchronized (counter) {
                while (counter.value <= 100) {
                    if (!counter.odd) {
                        System.out.println(Thread.currentThread().getName() + " " + counter.value);
                        counter.value++;
                        counter.odd = !counter.odd;
                        counter.notify();
                    }
                    try {
                        counter.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    static class Test2 implements Runnable {
        private Counter counter;

        Test2(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            synchronized (counter) {
                while (counter.value <= 100) {
                    if (counter.odd) {
                        System.out.println(Thread.currentThread().getName() + " " + counter.value);
                        counter.value++;
                        counter.odd = !counter.odd;
                        counter.notify();
                    }
                    try {
                        counter.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


//    public static void main(String[] args) {
//        Test text = new Test();
//        Thread thread1 = new Thread(text);
//        Thread thread2 = new Thread(text);
//        thread1.start();
//        thread2.start();
//    }
//
//    public static class Test implements Runnable {
//
//        private int count = 100;
//        private int nums = 0;
//        Test() {
//        }
//
//        @Override
//        public  void run() {
//            synchronized (this) {
//                while (true) {
//                    notify();
//                    if(nums <= count) {
//                        System.out.println(Thread.currentThread().getName() + " " + nums);
//                        nums++;
//                    }else {
//                        break;
//                    }
//                    try {
//                        wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }
//    }


//}
