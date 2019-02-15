package ru.externalTasks.arrays;

//Заполнить массив нулями и единицами,
// при этом данные значения чередуются, начиная с нуля.
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = 1;
            i++;
        }
    }


}
