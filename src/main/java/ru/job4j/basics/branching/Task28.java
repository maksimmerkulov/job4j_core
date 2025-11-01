package ru.job4j.basics.branching;

/*
  Ниже представлен метод isEnough(int pupils, int desks), который принимает 2
  целых числа - количество учеников в классе и количество парт соответственно.

  Задание: Написать код, который выводит в консоль "Да", если парт в классе
  хватит на всех учеников, иначе вывести "Нет".

  Примечание: за одной партой могут сидеть только 2 ученика.
*/
public class Task28 {
    public static void isEnough(int pupils, int desks) {
        if (desks * 2 >= pupils) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isEnough(20, 10);
    }
}
