package com.Test;

import java.util.Arrays;

class Student {
    private int id;
    private String name;
    private String course;
    private int[] marks = new int[3];

    public Student(int id, String name, String course, int[] marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course=" + course + ", marks=" + Arrays.toString(marks) + "]";
    }
}
