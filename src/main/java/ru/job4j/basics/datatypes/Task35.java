package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод firstLastChange(int number), который принимает целое
  положительное трехзначное число.

  Задание: Написать код, который выполняет перестановку первой и последней цифры
  входящего трехзначного числа, и выводит результат в консоль.

  Например, для числа 125 вывод должен быть:

  521

  Примечание: в вычислениях нужно пользоваться операторами "вычисление остатка"
  (%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(num3 * 100 + num2 * 10 + num1);
    }

    public static void main(String[] args) {
        firstLastChange(125);
    }
}
