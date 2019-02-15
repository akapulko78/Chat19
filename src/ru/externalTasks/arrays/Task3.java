package ru.externalTasks.arrays;
//Заполнить массив последовательными нечетными числами, начиная с единицы.
public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0, j = 1; i < 10; i++, j+=2) {
            arr[i] = j;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
