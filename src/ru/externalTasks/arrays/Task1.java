package ru.externalTasks.arrays;

import java.util.Arrays;

//Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице.
public class Task1 {

  public static void main(String[] args) {
    int[] box = new int[10];
    box[0] = box[box.length - 1] = 1;
    for (int boxes : box) {
      System.out.print(boxes);
    }
  }


}
