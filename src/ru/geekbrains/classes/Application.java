package ru.geekbrains.classes;

import ru.geekbrains.classes.animals.Cat;
import ru.geekbrains.classes.animals.Dog;
import ru.geekbrains.classes.obstacles.Course;
import ru.geekbrains.classes.obstacles.Cross;
import ru.geekbrains.classes.obstacles.Wall;
import ru.geekbrains.classes.obstacles.Water;

public class Application {

    public static void main(String[] args) {
        Participant[] participants = new Participant[]{
                new Cat("Барсик", 10, 12, 0),
                new Dog("Дружок", 20, 5, 15),
                new Cat("Мурзик", 9, 14, 0),
                new Robot("Вертер", 50, 50, 50)};

        Course course = new Course(new Cross(5),
                new Wall(3),
                new Water(7));

        Team team = new Team("Team", participants);
        course.doIt(team);

        team.getResults();
    }
}
