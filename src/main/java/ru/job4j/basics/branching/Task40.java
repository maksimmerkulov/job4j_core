package ru.job4j.basics.branching;

/*
  Ниже представлен метод isDoubleEven(int number), который принимает целое
  трехзначное положительное число.

  Трехзначное число является "дважды четным", если и оно само, и сумма его цифр
  - четные.

  Задание: Написать код, который проверяет, является ли входящее число "дважды
  четным". Если является - вывести "Да", если нет - "Нет".

  Например, вывод для числа 336 будет:

  Да

  Примечание: задание имеет решение с использованием единственного оператора if
  - без составного условия.
*/
public class Task40 {
    public static void isDoubleEven(int number) {
        int sum = (number / 100) + ((number / 10) % 10) + (number % 10);

        if (number % 2 == 0 && sum % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isDoubleEven(336);
    }
}
