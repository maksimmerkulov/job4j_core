package ru.job4j.basics.branching;

/*
  Ниже представлен метод isEqual(int num1, int num2), который принимает 2 целых
  числа.

  Задание: Написать код, который выводит в консоль "Да", если числа равны между
  собой, иначе "Нет".
*/
public class Task26 {
    public static void isEqual(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isEqual(1, 1);
    }
}
