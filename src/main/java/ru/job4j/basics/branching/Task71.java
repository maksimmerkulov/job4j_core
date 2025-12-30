package ru.job4j.basics.branching;

/*
  Ниже представлен метод change(int money), который принимает целое число -
  сумму в рублях, которую нужно выплатить.

  В кассе есть купюры достоинством 100, 50 и 10 рублей.

  Задание: Написать код, который определяет, каким минимальным набором купюр
  можно выдать данную сумму. Результат вывести в консоль в виде: "100: x, 50: y,
  10: z", где x, y, z - количество соответствующих купюр к выдаче. Если сумму
  нельзя выдать полностью (Например, 156) - вывести "Нельзя".

  Например, для числа 170, вывод будет:

  100: 1, 50: 1, 10: 2
*/
public class Task71 {
    public static void change(int money) {
        if (money % 10 != 0) {
            System.out.println("Нельзя");
            return;
        }

        int hundreds = money / 100;
        money %= 100;

        int fifties = money / 50;
        money %= 50;

        int tens = money / 10;

        System.out.println(
                "100: " + hundreds
                        + ", 50: " + fifties
                        + ", 10: " + tens
        );
    }

    public static void main(String[] args) {
        change(170);
    }
}
