package ru.externalTasks.strings;

//Дана строка. Вывести ее три раза через запятую и
// показать количество символов в ней.
public class Task1 {
    private String string = "строка";

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        for (int i = 0; i < 3; i++) {
            System.out.print(task1.string + ",");
        }
        System.out.println(task1.string.length());
    }
}
