package com.geekbrains;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik","Grey", 3);
        cat.run(100);
        cat.run(600);
        cat.swim(34);

        Dog dog = new Dog("Bobik", "Black", 10);
        dog.run(100);
        dog.run(800);
        dog.swim(10);
        dog.swim(200);
    }
}
