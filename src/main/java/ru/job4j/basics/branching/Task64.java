package ru.job4j.basics.branching;

/*
  Ниже представлен метод gradePrint(int number), который принимает целое число.

  Задание: Написать код, который выводит в консоль текстовую форму оценки: 1-2 -
  "Плохо", 3 - "Удовлетворительно", 4 - "Хорошо", 5 - "Отлично". Если число не
  соответствует какой-либо оценке - вывести "Не соответствует".

  Например, для числа 5 вывод будет:

  Отлично
*/
public class Task64 {
    public static void gradePrint(int number) {
        if (number == 1 || number == 2) {
            System.out.println("Плохо");
        } else if (number == 3) {
            System.out.println("Удовлетворительно");
        } else if (number == 4) {
            System.out.println("Хорошо");
        } else if (number == 5) {
            System.out.println("Отлично");
        } else {
            System.out.println("Не соответствует");
        }
    }

    public static void main(String[] args) {
        gradePrint(5);
    }
}
