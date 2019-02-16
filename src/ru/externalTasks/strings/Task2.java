package ru.externalTasks.strings;

//Дана строка. Вывести первый, последний и средний (если он есть)) символы.
public class Task2 {
    private Task2(String str) {
        this.str = str;
    }

    private String str;

    public static void main(String[] args) {
        Task2 task2 = new Task2("шалаш");
        System.out.println(task2.str.charAt(0));
        if (task2.str.length() > 1 && (task2.str.length() % 2) != 0) {
            System.out.println(task2.str.charAt((task2.str.length()) / 2));
        }
        System.out.println(task2.str.charAt(task2.str.length() - 1));
    }
}

