package ru.geekbrains.classes;

public class Team {
    private final String nameOfTeam;

    public Participant[] getParticipants() {
        return participants;
    }

    private final Participant[] participants;

    public Team(String nameOfTeam, Participant[] participants) {

        this.nameOfTeam = nameOfTeam;
        this.participants = participants;
    }

    public void getResults() {
        System.out.printf("Итоги для команды %s:%n", nameOfTeam);
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }

}
