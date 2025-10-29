package ru.job4j.basics.datatypes;

/*
  Ниже представлен метод firstLastChange(int number), который принимает целое
  положительное четырехзначное число.

  Задание: Написать код, который выполняет перестановку первой и последней цифры
  входящего четырехзначного числа, и выводит результат в консоль.

  Переменные first, middle и last - первая цифра, средняя секция цифр и
  последняя цифра соответственно.

  Например, для числа 4265 вывод должен быть:

  5264

  Примечание: в вычислениях нужно пользоваться операторами "вычисление остатка"
  (%), "вычисление частного"(/) и базовыми арифметическими операциями.
*/
public class Task36 {
    public static void firstLastChange(int number) {
        int first, middle, last;
        first = number / 1000;
        middle = (number / 10) % 100;
        last = number % 10;
        System.out.println(last * 1000 + middle * 10 + first);
    }

    public static void main(String[] args) {
        firstLastChange(4265);
    }
}
