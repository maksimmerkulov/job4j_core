package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод rightCircleShift(int number), который принимает целое
  положительное трехзначное число.

  Задание: Написать код, который выполняет "сдвиг числа вправо по кругу", то
  есть все цифры числа сдвигаются вправо, а число единиц (последняя цифра)
  перемещается в старший разряд числа (первая цифра). Результат вывести в
  консоль.

  Например, для числа 123 вывод должен быть:

  312

  Примечание: в вычислениях нужно пользоваться операторами "вычисление остатка"
  (%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task41 {
    public static void rightCircleShift(int number) {
        int firstTwo, last;
        firstTwo = number / 10;
        last = number % 10;
        System.out.println(last * 100 + firstTwo);
    }

    public static void main(String[] args) {
        rightCircleShift(123);
    }
}
