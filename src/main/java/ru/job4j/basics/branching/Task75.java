package ru.job4j.basics.branching;

/*
  Ниже представлен метод innerNum(int num2, int num4), который принимает 2 целых
  числа - num2 - двузначное, num4 - четырехзначное.

  Задание: Написать код, который определяет и выводит в консоль количество раз,
  когда двузначное число фигурирует как "внутреннее" по отношению к
  четырехзначному. То есть какая-то пара смежных цифр в четырехзначном числе
  образует входящее двузначное число от 0 до 3 раз.

  Например, для чисел 33 и 3331 вывод будет:

  2
*/
public class Task75 {
    public static void innerNum(int num2, int num4) {
        int count = 0;

        int firstPair = num4 / 100;
        int middlePair = (num4 / 10) % 100;
        int lastPair = num4 % 100;

        if (num2 == firstPair) {
            count++;
        }
        if (num2 == middlePair) {
            count++;
        }
        if (num2 == lastPair) {
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        innerNum(33, 3331);
    }
}
