package ru.geekbrains.java.oop.at;

import ru.geekbrains.java.oop.at.obstacles.Obstacles;
import ru.geekbrains.java.oop.at.obstacles.Treadmill;
import ru.geekbrains.java.oop.at.obstacles.Wall;
import ru.geekbrains.java.oop.at.participants.Cat;
import ru.geekbrains.java.oop.at.participants.Person;
import ru.geekbrains.java.oop.at.participants.Robot;
import ru.geekbrains.java.oop.at.participants.Runner;

public class Start {
    public static void main(String[] args) {
        Runner catTom = new Cat("Tom", 10, 5);
        Runner catLarry = new Cat("Larry", 7, 3);
        Runner catBoris = new Cat("Boris", 15, 8);

        Runner humanMax = new Person("Max", 13, 4);
        Runner humanAnna = new Person("Anna", 10, 2);
        Runner humanAlex = new Person("Alex", 18, 6);

        Runner robotVally = new Robot("Vally", 13, 4);
        Runner robotEva = new Robot("Eva", 10, 2);
        Runner robotBender = new Robot("Bender", 18, 6);

        Runner[] runners = {catTom, catLarry, catBoris, humanMax, humanAnna, humanAlex, robotVally, robotEva, robotBender};


        Obstacles wall = new Wall(5);
        Obstacles wall1 = new Wall(6);
        Obstacles wall2 = new Wall(7);

        Obstacles treadmill = new Treadmill(10);
        Obstacles treadmill1 = new Treadmill(14);
        Obstacles treadmill2 = new Treadmill(15);

        Obstacles[] obstacles = {wall, wall1, wall2, treadmill, treadmill1, treadmill2};


        System.out.println("Гонка началась!");
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println("\n\nИспытание " + (i + 1));

            for (Runner runner : runners) {
                if (runner.getSuccess()) {
                    System.out.println("------------");
                    obstacles[i].check(runner);
                }

            }
        }
    }
}
