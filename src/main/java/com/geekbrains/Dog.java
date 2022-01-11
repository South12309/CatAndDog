package com.geekbrains;

public class Dog extends Animal {

    public Dog(String name, String color, int age) {
        super(name, color, age, 500, 10);
    }


    @Override
    public void run(int distance) {
        String message;
        if (distance>distanceRunMax) {
            message=String.format("%s не может пробежать дальше %d метров", name, distanceRunMax);
        }
        else {
            message=String.format("%s пробежал %d м.", name, distance);
        }

        System.out.println(message);

    }

    @Override
    public void swim(int distance) {
        String message;
        if (distanceSwimMax==0) {
            message=String.format("%s не умеет плавать", name);
        } else if (distance>distanceSwimMax) {
            message=String.format("Собака не может проплыть дальше %d метров", distanceSwimMax);
        }
        else {
            message=String.format("%s проплыл %d м.", name, distance);
        }

        System.out.println(message);

    }
}
