package ru.externalTasks.strings;

//Дана строка. Вывести первые три символа и последний три символа,
// если длина строки больше 5.
// Иначе вывести первый символ столько раз, какова длина строки.
public class Task3 {
    String str;

    public Task3(String str) {
        this.str = str;
        char[] dst = new char[str.length()];
        if (str.length() > 5) {
            str.getChars(0, 3, dst, 0);
            str.getChars(str.length() - 3, str.length(), dst, 3);
            System.out.println(dst);
        } else {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(0));
            }
        }
    }


    public static void main(String[] args) {
        Task3 task3 = new Task3("croc");
    }


}
