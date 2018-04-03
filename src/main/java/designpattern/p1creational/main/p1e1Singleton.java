package designpattern.p1creational.main;

import designpattern.p1creational.e1singleton.Singleton0;
import designpattern.p1creational.e1singleton.Singleton1;

// 单例模式
public class p1e1Singleton extends Thread {

    public static void main(String[] args) {
        Thread[] tpool = new p1e1Singleton[10];
        for(int i = 0 ; i < tpool.length ; i++){
            tpool[i] = new p1e1Singleton();
        }

        for (int j = 0; j < tpool.length; j++) {
            tpool[j].start();
        }
    }

    @Override
    public void run() {
        System.out.println(Singleton0.getInstance().hashCode());
    }
}
