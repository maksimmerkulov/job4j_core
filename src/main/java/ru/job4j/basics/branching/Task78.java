package ru.job4j.basics.branching;

/*
  Ниже представлен метод divWithoutRemainder(int num), который принимает целое
  положительное трехзначное число.

  Задание: Написать код, который определяет и выводит в консоль, на какие числа
  из составляющих входящее число цифр оно делится без остатка. Если таких чисел
  несколько, то вывести полученные значения через пробел. Если таких чисел нет -
  вывести "Таких чисел нет".

  Примечание: Учесть возможность того, что одной из цифр входящего числа может
  быть ноль.

  Например, для числа 456 вывод будет:

  4 6
*/
public class Task78 {
    public static void divWithoutRemainder(int num) {
        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;
        boolean found = false;

        if (first != 0 && num % first == 0) {
            System.out.print(first);
            found = true;
        }

        if (middle != 0 && num % middle == 0) {
            if (found) {
                System.out.print(" ");
            }
            System.out.print(middle);
            found = true;
        }

        if (last != 0 && num % last == 0) {
            if (found) {
                System.out.print(" ");
            }
            System.out.print(last);
            found = true;
        }

        if (!found) {
            System.out.print("Таких чисел нет");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        divWithoutRemainder(456);
    }
}
