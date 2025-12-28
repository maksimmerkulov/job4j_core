package ru.job4j.basics.branching;

/*
  Ниже представлен метод secondsToMinutes(int seconds), который принимает целое
  число - промежуток времени, выраженный в секундах.

  Задание: Написать код, который переводит этот промежуток времени в промежуток,
  выраженный минутами и секундами. Результат вывести в консоль в виде "Минут: x,
  секунд: y", где x - минуты, y - секунды. Если входящий промежуток времени
  превышает один час, то вывести "Расчет не производится".

  Например, для числа 65 вывод будет:

  Минут: 1, секунд: 5
*/
public class Task70 {
    public static void secondsToMinutes(int seconds) {
        if (seconds > 3600) {
            System.out.println("Расчет не производится");
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            System.out.println("Минут: " + minutes + ", секунд: " + remainingSeconds);
        }
    }

    public static void main(String[] args) {
        secondsToMinutes(65);
    }
}
