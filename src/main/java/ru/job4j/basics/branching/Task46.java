package ru.job4j.basics.branching;

/*
  Ниже представлен метод changeNums(int num1, int num2), который принимает 2
  целых числа.

  Задание: Написать код, который изменяет эти числа следующим образом:

  - Если числа имеют разные значения, то большее число уменьшается на 1, а
  меньшее - увеличивается на 1.

  - Если числа одинаковы, то оба увеличиваются на 1.

  Вывести в консоль построчно новые значения.

  Например, вывод для чисел 17 и 25 будет:

  18

  24
*/
public class Task46 {
    public static void changeNums(int num1, int num2) {
        if (num1 == num2) {
            num1++;
            num2++;
        } else if (num1 > num2) {
            num1--;
            num2++;
        } else {
            num1++;
            num2--;
        }

        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        changeNums(17, 25);
    }
}
