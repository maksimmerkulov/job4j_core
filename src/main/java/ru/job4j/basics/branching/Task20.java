package ru.job4j.basics.branching;

/*
  Ниже представлен метод numCheck(int number), который принимает трехзначное
  положительное целое число.

  Трехзначное положительное число называется "четно-красивым", если каждая из
  его цифр - четная.

  Задание: Написать код, который проверяет - является ли число "четно-красивым".
  Если да - вывести в консоль слово "Да", иначе - "Нет".

  Примечание: Задание имеет решение с использованием одного оператора if и без
  составного условия.
*/
public class Task20 {
    public static void numCheck(int number) {
        if ((number / 100 % 2 + number / 10 % 10 % 2 + number % 10 % 2) == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        numCheck(122);
    }
}
