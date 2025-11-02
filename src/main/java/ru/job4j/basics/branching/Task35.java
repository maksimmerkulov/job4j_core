package ru.job4j.basics.branching;

/*
  Ниже представлен метод gradeCheck(int grade), который принимает целое число.

  Задание: Написать код, который проверяет, является ли входящее число реальной
  оценкой, то есть находится в диапазоне от 1 до 5. Вывести в консоль "Да", если
  является, и "Нет", если не является.

  Например, для числа -2 вывод будет:

  Нет
*/
public class Task35 {
    public static void gradeCheck(int grade) {
        if (grade >= 1 && grade <= 5) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        gradeCheck(-2);
    }
}
