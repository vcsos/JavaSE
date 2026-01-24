package com.vcsos.staticLearn.e_ArrObject;

public class Student {
    private String name;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }
}
