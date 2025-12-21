package ru.job4j.basics.branching;

/*
  Ниже представлен метод season(int number), который принимает целое число,
  которое должно соответствовать одному из порядковых номеров месяцев.

  Задание: Написать код, который выводит в консоль время года, к которому
  относится этот месяц ("Весна", "Лето", "Осень", "Зима"). Если входящее число
  не соответствует какому-либо месяцу - вывести "Не является месяцем".

  Например, для числа 9 вывод будет:

  Осень
*/
public class Task65 {
    public static void season(int number) {
        if (number >= 3 && number <= 5) {
            System.out.println("Весна");
        } else if (number >= 6 && number <= 8) {
            System.out.println("Лето");
        } else if (number >= 9 && number <= 11) {
            System.out.println("Осень");
        } else if (number == 12 || number == 1 || number == 2) {
            System.out.println("Зима");
        } else {
            System.out.println("Не является месяцем");
        }
    }

    public static void main(String[] args) {
        season(9);
    }
}
