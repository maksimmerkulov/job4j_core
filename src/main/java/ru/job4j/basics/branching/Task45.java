package ru.job4j.basics.branching;

/*
  Ниже представлен метод changeToRoundNum(int number), который принимает целое
  положительное число.

  Задание: Написать код, который изменяет входящее число следующим образом:

  - Для четного числа - увеличивает его до ближайшего "круглого" и выводит новое
  значение в консоль в виде "Увеличено до n".

  - Для нечетного числа - уменьшает его до ближайшего "круглого" и выводит новое
  значение в консоль в виде "Уменьшено до n".

  - Если число оканчивается на 0, то есть оно уже "круглое", то вывести в
  консоль "Без изменений".

  n - полученное значение после увеличения/уменьшения.

  Например, вывод для числа 459 будет:

  Уменьшено до 450
*/
public class Task45 {
    public static void changeToRoundNum(int number) {
        int lastDigit = number % 10;

        if (lastDigit == 0) {
            System.out.println("Без изменений");
        } else if (number % 2 == 0) {
            int increased = number + (10 - lastDigit);
            System.out.println("Увеличено до " + increased);
        } else {
            int decreased = number - lastDigit;
            System.out.println("Уменьшено до " + decreased);
        }
    }

    public static void main(String[] args) {
        changeToRoundNum(459);
    }
}
