package ru.job4j.basics.branching;

/*
  Ниже представлен метод isPositive(int number), который принимает целое число.

  Задание: Написать код, который выводит в консоль "Да", если число
  положительное, иначе "Нет".
*/
public class Task25 {
    public static void isPositive(int number) {
        if (number > 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isPositive(1);
    }
}
