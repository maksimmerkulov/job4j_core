package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод rightNumChange(int number1, int number2), который
  принимает 2 целых положительных трехзначных числа.

  Задание: Написать код, который обменивает правые цифры этих чисел между собой.
  Результат вывести в консоль построчно.

  Например, для чисел 123 и 456 вывод должен быть:

  126

  453

  Примечание: в вычислениях нужно пользоваться операторами "вычисление остатка"
  (%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        int last1, last2, num1, num2;
        last1 = number1 % 10;
        last2 = number2 % 10;
        num1 = (number1 / 10) * 10 + last2;
        num2 = (number2 / 10) * 10 + last1;
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        rightNumChange(123, 456);
    }
}
