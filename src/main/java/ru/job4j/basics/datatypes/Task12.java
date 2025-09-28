package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/*
  Это задание противоположно предыдущему, теперь нужно выполнить преобразование
  дюймов в сантиметры.

  Связь между сантиметром и дюймом выражается следующим выражением:
  1 дюйм = 2.54 сантиметра.

  Задача: Написать код, реализующий перевод дюймов в сантиметры.

  Значение дюймов принимается вводом с клавиатуры с помощью класса Scanner
  в виде целого числа.

  Примечания: для удобства команда System.out.printf("%.2f", centimeters);
  выводит на печать полученное значение с округлением до двух символов после
  запятой. Обратите внимание, что входные данные имеют тип int (целое число),
  а выходные данные имеют тип double (значение с дробной частью).
*/
public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();
        double centimeters = inches * 2.54;
        System.out.printf(Locale.US, "%.2f", centimeters);
    }
}
