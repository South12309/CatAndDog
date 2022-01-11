package com.geekbrains;

public class Cat extends Animal {
    private static int count = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age, 200, 0);
        count++;
    }

    @Override
    public void run(int distance) {

        String message;
        if (distance > distanceRunMax) {
            message = String.format("%s не может пробежать дальше %d метров", name, distanceRunMax);
        } else {
            message = String.format("%s пробежал %d м.", name, distance);
        }

        System.out.println(message);

    }

    @Override
    public void swim(int distance) {
        String message;
        if (distanceSwimMax == 0) {
            message = String.format("%s не умеет плавать", name);
        } else if (distance > distanceSwimMax) {
            message = String.format("%s не может проплыть дальше %d метров", name, distanceSwimMax);
        } else {
            message = String.format("%s проплыл %d м.", name, distance);
        }

        System.out.println(message);
    }

    public static int getCount(){
        return count;
    }
}
