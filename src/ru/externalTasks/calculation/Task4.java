package ru.externalTasks.calculation;
//Вывести на экран прямоугольник, заполненный буквами А.
// Количество строк в прямоугольнике равно 5, количество столбцов равно 8.
public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("A");
            }
            System.out.println("");
        }
    }
}
