package ru.job4j.basics.branching;

/*
  Ниже представлен метод isPositive(int num1, int num2), который принимает 2
  целых числа - числитель дроби и ее знаменатель соответственно.

  Задание: Написать код, который выводит в консоль "Да", если дробь
  положительная, иначе "Нет".

  Примечание: Положительными дробями являются все дроби больше нуля, а
  отрицательными - все дроби меньше нуля.

  Также можно учитывать, что входящий параметр знаменателя отличен от нуля.
*/
public class Task24 {
    public static void isPositive(int num1, int num2) {
        if ((num1 > 0 && num2 > 0) || (num1 < 0 && num2 < 0)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isPositive(1, 5);
    }
}
