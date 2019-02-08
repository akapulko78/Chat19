package ru.geekbrains.classes;

import ru.geekbrains.classes.obstacles.Obstacle;

public class Team implements Participant {
    private String nameOfTeam;

    public String getNameOfTeam() {
        return nameOfTeam;
    }

    Participant[] team;

    public Team(String nameOfTeam,  Participant participant1,
                Participant participant2, Participant participant3,
                Participant participant4) {
        this.nameOfTeam = nameOfTeam;
        team = new Participant[]{participant1,participant2,
                participant3,participant4};
    }


    public void showResults(){
        System.out.println("Прошли дистанцию:");
        for (Participant participant : team) {
            if (participant.isOnDistance()) {
                System.out.println(participant);
            }
        }
    }
    public void showInfo(){
        System.out.println("Команда " + getNameOfTeam() + " :");
        for (Participant participant : team) {
                System.out.println(participant);
        }
    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void jump(int height) {

    }

    @Override
    public void swim(int distance) {

    }
}
