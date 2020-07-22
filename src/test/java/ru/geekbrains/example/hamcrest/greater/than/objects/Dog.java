package ru.geekbrains.example.hamcrest.greater.than.objects;

public class Dog extends Animal {
    public final String name;

    public Dog(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "моё имя " + name;
    }

    public String getName() {
        return name;
    }
}

