package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод leftNumChange(int number1, int number2), который
  принимает 2 целых положительных трехзначных числа.

  Задание: Написать код, который обменивает левые цифры этих чисел между собой.
  Результат вывести в консоль построчно.

  Например, для чисел 123 и 456 вывод должен быть:

  423

  156

  Примечание: в вычислениях нужно пользоваться операторами "вычисление остатка"
  (%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        int first1, first2, num1, num2;
        first1 = number1 / 100;
        first2 = number2 / 100;
        num1 = first2 * 100 + (number1 % 100);
        num2 = first1 * 100 + (number2 % 100);
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        leftNumChange(123, 456);
    }
}
