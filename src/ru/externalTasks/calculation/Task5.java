package ru.externalTasks.calculation;

//Вывести на экран букву "W" из символов "*" (звездочка).
public class Task5 {
    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            if (i == 0 || i == 6 || i == 12) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < 13; i++) {
            if (i == 1 || i == 5 || i == 7 || i == 11) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < 13; i++) {
            if (i == 2 || i == 4 || i == 8 || i == 10) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < 13; i++) {
            if (i == 3 || i == 9) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
