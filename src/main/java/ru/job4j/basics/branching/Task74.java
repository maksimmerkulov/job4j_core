package ru.job4j.basics.branching;

/*
  Ниже представлен метод innerNum(int num2, int num4), который принимает 2 целых
  числа - num2 - двузначное, num4 - четырехзначное.

  Задание: Написать код, который определяет, является ли двузначное число
  "внутренним" по отношению к четырехзначному. То есть какая-то пара смежных
  цифр в четырехзначном числе образует входящее двузначное число. Вывести в
  консоль "Да", если является, и "Нет", если не является.

  Например, для чисел 24 и 1524 вывод будет:

  Да
*/
public class Task74 {
    public static void innerNum(int num2, int num4) {
        int firstPair = num4 / 100;
        int middlePair = (num4 / 10) % 100;
        int lastPair = num4 % 100;

        if (num2 == firstPair || num2 == middlePair || num2 == lastPair) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        innerNum(24, 1524);
    }
}
