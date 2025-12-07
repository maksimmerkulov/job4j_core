package ru.job4j.basics.branching;

/*
  Ниже представлен метод transform(int number), который принимает целое
  трехзначное число.

  Задание: Написать код, который выполняет следующее:

  - Если число четное - все четные цифры этого числа увеличиваются на 1, а
  нечетные - уменьшаются на 1. Если увеличение/уменьшение невозможно (например,
  увеличить 9), то оставить эту цифру без изменения.

  - Если число нечетное, то все изменения произвести наоборот - четные цифры
  уменьшить на 1, нечетные - увеличить на 1.

  Получившееся число вывести в консоль.

  Например, для числа 309 вывод будет:

  409
*/
public class Task54 {
    public static void transform(int number) {
        int sign = number < 0 ? -1 : 1;
        int n = Math.abs(number);

        int num1 = n / 100;
        int num2 = (n / 10) % 10;
        int num3 = n % 10;

        boolean isEven = number % 2 == 0;

        num1 = transformDigit(num1, isEven);
        num2 = transformDigit(num2, isEven);
        num3 = transformDigit(num3, isEven);

        int result = sign * (num1 * 100 + num2 * 10 + num3);
        System.out.println(result);
    }

    private static int transformDigit(int digit, boolean isEven) {
        boolean isDigitEven = digit % 2 == 0;

        if (isEven) {
            if (isDigitEven) {
                return (digit < 9) ? digit + 1 : digit;
            } else {
                return (digit > 0) ? digit - 1 : digit;
            }
        } else {
            if (isDigitEven) {
                return (digit > 0) ? digit - 1 : digit;
            } else {
                return (digit < 9) ? digit + 1 : digit;
            }
        }
    }

    public static void main(String[] args) {
        transform(309);
    }
}
