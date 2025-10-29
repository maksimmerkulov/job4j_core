package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод rightCircleShift(int number), который принимает целое
  положительное четырехзначное число.

  Задание: Написать код, который выполняет "сдвиг числа вправо по кругу", то
  есть все цифры числа сдвигаются вправо, а число единиц (последняя цифра)
  перемещается в старший разряд числа (первая цифра). Результат вывести в
  консоль.

  Например, для числа 1234 вывод должен быть:

  4123

  Примечание: в вычислениях нужно пользоваться операторами "вычисление остатка"
  (%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task42 {
    public static void rightCircleShift(int number) {
        int firstThree, last;
        firstThree = number / 10;
        last = number % 10;
        System.out.println(last * 1000 + firstThree);
    }

    public static void main(String[] args) {
        rightCircleShift(1234);
    }
}
