package com.synchronisation;

class Print4 {
    public synchronized void printName(String name) {
        System.out.print("{" + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("}");
    }
}

class MyThread1 extends Thread {
    Print4 p;
    String n;

    public MyThread1(Print4 p, String n) {
        this.p = p;
        this.n = n;
    }

    public void run() {
        p.printName(n); 
    }
}

public class SharedResource2 {
    public static void main(String[] args) {
        Print4 p = new Print4();
        MyThread1 t1 = new MyThread1(p, "Suraj");
        MyThread1 t2 = new MyThread1(p, "Subhodh");
        t1.start();
        t2.start();
    }
}
