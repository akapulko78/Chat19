package ru.geekbrains.classes.obstacles;


import ru.geekbrains.classes.Participant;
import ru.geekbrains.classes.Team;

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
