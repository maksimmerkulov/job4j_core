package ru.job4j.basics.console;

/*
  Дана строка

  +!?

  Напишите класс, который анализирует входящую строку и выводит на экран
  последовательно три первых символа строки, затем четыре вторых символа и затем
  два третьих символа строки.
*/
public class Task16 {
    public static void main(String[] args) {
        String source = "+!?";
        System.out.print(String.valueOf(source.charAt(0)).repeat(3));
        System.out.print(String.valueOf(source.charAt(1)).repeat(4));
        System.out.print(String.valueOf(source.charAt(2)).repeat(2));
    }
}
