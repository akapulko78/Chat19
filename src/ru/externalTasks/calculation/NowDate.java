package ru.externalTasks.calculation;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

//Вывести на экран текущее название дня недели, название месяца и свое имя.
// Каждое слово должно быть в отдельной строке.
public class NowDate {
  public static void main(String[] args) {
    Date dateNow = new Date();

    System.out.printf("%ta\n%<tb\n%s",  dateNow,"Daniil");
  }

}
