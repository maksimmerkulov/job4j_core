package ru.job4j.basics.branching;

/*
  Ниже представлен метод numModify(int number), который принимает целое число.

  Задание: Написать код, который делает следующее:

  - Если число отрицательное, превращает его в положительное.

  - Если число положительное, превращает его в ноль.

  - Если ноль, то оставить без изменений.

  Например, при входящем числе -6 вывод будет:

  6
*/
public class Task30 {
    public static void numModify(int number) {
        if (number < 0) {
            number = -number;
        } else if (number > 0) {
            number = 0;
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        numModify(-6);
    }
}
