package ru.job4j.basics.console;

/*
  Дана строка

  +!?

  Напишите класс, который анализирует входящую строку и выводит на экран в первой
  строке три раза первый символ, во второй строке - четыре раза второй символ, и
  в третьей - два раза третий символ. Например, для входящей строки "+!?" вывод
  должен быть в виде:

  +++
  !!!!
  ??
*/
public class Task15 {
    public static void main(String[] args) {
        String source = "+!?";
        System.out.println(String.valueOf(source.charAt(0)).repeat(3));
        System.out.println(String.valueOf(source.charAt(1)).repeat(4));
        System.out.print(String.valueOf(source.charAt(2)).repeat(2));
    }
}
