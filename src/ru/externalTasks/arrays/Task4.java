package ru.externalTasks.arrays;

//Сформировать массив из элементов арифметической прогрессии
// с заданным первым элементом x и разностью d.
public class Task4 {
    private int x;
    private int d;
    private int[] arr;

    public Task4(int[]arr, int x, int d) {
        this.arr = arr;
        this.x = x;
        this.d = d;
        for (int i = 0, j = x; i < arr.length; i++, j += d) {
            arr[i] = j;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Task4 task4 = new Task4(arr,1,5);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

}
