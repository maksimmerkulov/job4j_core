package ru.job4j.basics.branching;

/*
  Ниже представлен метод sumOrMultiply(int number1, int number2), который
  принимает 2 целых числа.

  Задание: Написать код, который выводит на экран сумму этих чисел, если первое
  больше второго, если же наоборот - выводит их произведение.

  В случае, если числа одинаковы, вывести сообщение "Числа равны".
*/
public class Task19 {
    public static void sumOrMultiply(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + number2);
        } else if (number1 < number2) {
            System.out.println(number1 * number2);
        } else {
            System.out.println("Числа равны");
        }
    }

    public static void main(String[] args) {
        sumOrMultiply(10, 9);
    }
}
