package ru.geekbrains.classes.lesson1.obstacles;

import ru.geekbrains.classes.lesson1.Participant;

public class Cross extends Obstacle {

    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}
