package com.july24;

/*
 5.	 Write a Java program to create an interface Flyable with a method called fly_obj().
  Create three classes Spacecraft,
  Airplane, and Helicopter that implement the Flyable interface.
   Implement the fly_obj() method for each of the three classes.
 */


interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Inside Spacecraft");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Inside Airplane");
    }
}

class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Inside Helicopter");
    }
}

public class Flyable_q {
    public static void main(String[] args) {
        Spacecraft s = new Spacecraft();
        s.fly_obj();
        
        Airplane a = new Airplane();
        a.fly_obj();
        
        Helicopter h = new Helicopter();
        h.fly_obj();
    }
}

