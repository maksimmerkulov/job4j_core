package ru.job4j.basics.branching;

/*
  Ниже представлен метод numDecrease(int number), который принимает целое число.

  Задание: Написать код, который уменьшает число на единицу, если оно как
  минимум трехзначное и положительное. Результат вывести в консоль. Если число
  не проходит по условию, то вывести это же число без изменений.
*/
public class Task18 {
    public static void numDecrease(int number) {
        if (number >= 100) {
            number = number - 1;
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        numDecrease(10);
    }
}
