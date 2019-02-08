package ru.geekbrains.classes;

import ru.geekbrains.classes.obstacles.Obstacle;

public class Course {
    Obstacle[] course;

    public Course(Obstacle obstacle1, Obstacle obstacle2, Obstacle obstacle3) {
        course = new Obstacle[]{obstacle1, obstacle2, obstacle3};
    }



}
