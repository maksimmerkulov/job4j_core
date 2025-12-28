package ru.job4j.basics.branching;

/*
  Ниже представлен метод daytime(int number), который принимает целое число,
  которое должно указывать на один из часов в сутках.

  Пусть будут такие периоды в течение суток: с 6 до 10 - утро, с 11 до 17 -
  день, с 18 до 22 вечер, с 23 до 5 - ночь.

  Задание: Написать код, который выводит в консоль время дня, к которому
  относится входящий час ("Утро", "День", "Вечер", "Ночь"). Если число не
  является каким-либо часом - вывести "Не является часом". Диапазон часов 0-23.

  Например, для числа 14 вывод будет:

  День
*/
public class Task66 {
    public static void daytime(int number) {
        if (number < 0 || number > 23) {
            System.out.println("Не является часом");
        } else if (number >= 6 && number <= 10) {
            System.out.println("Утро");
        } else if (number >= 11 && number <= 17) {
            System.out.println("День");
        } else if (number >= 18 && number <= 22) {
            System.out.println("Вечер");
        } else {
            System.out.println("Ночь");
        }
    }

    public static void main(String[] args) {
        daytime(14);
    }
}
