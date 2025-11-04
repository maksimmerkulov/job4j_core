package ru.job4j.basics.branching;

/*
  Ниже представлен метод getRoundNumber(int number), который принимает целое
  положительное число.

  Задание: Написать код, который выводит в консоль ближайшее к данному "круглое
  число".

  Например, для введенного числа 553 выводится 550, а для 78 выводится 80.
*/
public class Task44 {
    public static void getRoundNumber(int number) {
        int lastDigit = number % 10;
        int rounded;

        if (lastDigit < 5) {
            rounded = number - lastDigit;
        } else {
            rounded = number + (10 - lastDigit);
        }

        System.out.println(rounded);
    }

    public static void main(String[] args) {
        getRoundNumber(553);
        getRoundNumber(78);
    }
}
