package ru.job4j.basics.branching;

/*
  Ниже представлен метод isEnough(int pupils, int chairs), который принимает 2
  целых числа - количество учеников в классе и количество стульев соответственно.

  Задание: Написать код, который выводит в консоль "Да", если стульев в классе
  хватит на всех учеников, иначе вывести "Нет".
*/
public class Task27 {
    public static void isEnough(int pupils, int chairs) {
        if (chairs >= pupils) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isEnough(20, 18);
    }
}
