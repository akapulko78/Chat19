package ru.geekbrains.classes.lesson1.obstacles;


import ru.geekbrains.classes.lesson1.Participant;
import ru.geekbrains.classes.lesson1.Team;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) { //переменное число аргументов
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Participant participant : team.getParticipants()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
