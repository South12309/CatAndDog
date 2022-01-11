package com.geekbrains;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    protected int distanceSwimMax;
    protected int distanceRunMax;

    public Animal() {
    }

    public Animal(String name, String color, int age, int distanceRunMax, int distanceSwimMax) {
        this.name=name;
        this.color=color;
        this.age=age;
        this.distanceRunMax=distanceRunMax;
        this.distanceSwimMax=distanceSwimMax;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
