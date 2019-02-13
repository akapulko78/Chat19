package ru.externalTasks.calculation;

public class Isogram {

  public static void main(String[] args) {
isIsogram("sdsa");
  }

  public static void isIsogram(String str) {
    char[] chars = str.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      System.out.println(chars);
    }
  }
}
