package com.july24;

/*
 Write a Java program to create an interface Playable with a method play() 
 that takes no arguments and returns void. Create three classes Football, Volleyball, 
 and Basketball that implement the Playable interface and
  override the play() method to play the respective sports.
 */



interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Football");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Volleyball");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Basketball");
    }
}

public class Playable_q {
    public static void main(String[] args) {
        Football f = new Football();
        f.play();
        
        Volleyball v = new Volleyball();
        v.play();
        
        Basketball b = new Basketball();
        b.play();
    }
}

