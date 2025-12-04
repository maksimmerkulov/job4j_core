package ru.job4j.basics.branching;

/*
  Ниже представлен метод maxLastDigit(int num1, int num2), который принимает 2
  целых положительных числа.

  Задание: Написать код, который выводит в консоль наибольшую из последних цифр
  этих двух чисел. Если последние цифры одинаковы, то вывести - "Одинаковые".

  Например, вывод для чисел 252 и 76 будет:

  6
*/
public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int last1 = num1 % 10;
        int last2 = num2 % 10;

        if (last1 > last2) {
            System.out.println(last1);
        } else if (last2 > last1) {
            System.out.println(last2);
        } else {
            System.out.println("Одинаковые");
        }
    }

    public static void main(String[] args) {
        maxLastDigit(252, 76);
    }
}
