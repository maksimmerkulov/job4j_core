package ru.job4j.basics.datatypes;

/*
  В коде ниже у нас есть метод increaseBy2(int number), который принимает на
  вход целое число.

  Задание: Дописать метод, чтобы он возвращал 3 следующих числа так, чтобы
  разница между каждым числом и следующим за ним составляла 2. Например: для
  входящего числа 6 нужно вывести числа 8, 10, 12.

  Примечание: в строке кода return a + ", " + b + ", " + c; высчитанные Вами 3
  числа собираются в строку (String), и эта строка является возвращаемым
  значением нашего метода в виде перечисления чисел через запятую.

  Важно! Решить упражнение нужно только c помощью арифметических операций, то
  есть без помощи циклов и подобных средств языка Java.
*/
public class Task15 {
    public static String increaseBy2(int number) {
        int a, b, c;
        a = number + 2;
        b = a + 2;
        c = b + 2;
        return a + ", " + b + ", " + c;
    }

    public static void main(String[] args) {
        int input = 6;
        String output = increaseBy2(input);
        System.out.println(input);
        System.out.println(output);
    }
}
