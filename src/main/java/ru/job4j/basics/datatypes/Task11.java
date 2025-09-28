package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/*
  Во многих странах для измерения небольших размеров используются не только
  единица измерения "сантиметр", но и "дюйм".

  Связь между сантиметром и дюймом выражается следующим выражением:
  1 дюйм = 2.54 сантиметра.

  Задача: Написать код, реализующий перевод сантиметров в дюймы.

  Значение сантиметров принимается вводом с клавиатуры с помощью класса Scanner
  в виде целого числа.

  Примечания: для удобства команда System.out.printf("%.2f", inches); выводит
  на печать полученное значение с округлением до двух символов после запятой.
  Обратите внимание, что входные данные имеют тип int (целое число), а выходные
  данные имеют тип double (значение с дробной частью).
*/
public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int centimeters = input.nextInt();
        double inches = centimeters / 2.54;
        System.out.printf(Locale.US, "%.2f", inches);
    }
}
