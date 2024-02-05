package com.synchronisation;

class print6 {
    public void printName(String name) {
        System.out.println("first");
        synchronized (this) { // Synchronized block to ensure exclusive access to the critical section
            System.out.print("{" + name);
            try {
                Thread.sleep(8000); 
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("}");
        System.out.println("Second");
    }
}

class Mythread3 extends Thread {
    print6 p;
    String n;

    public Mythread3(print6 p, String n) {
        this.p = p;
        this.n = n;
    }

    public void run() {
        p.printName(n);
    }
}

public class SyncoBlock {
    public static void main(String[] args) {
        print6 p4 = new print6();
        Mythread3 t1 = new Mythread3(p4, "Subodh");
        Mythread3 t2 = new Mythread3(p4, "Suraj");
        Mythread3 t3 = new Mythread3(p4, "Ri");
        t1.start();
        t2.start();
        t3.start();
    }
}
