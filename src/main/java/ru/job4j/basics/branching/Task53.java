package ru.job4j.basics.branching;

/*
  Ниже представлен метод transformFraction(int num1, int num2), который
  принимает 2 целых положительных числа.

  Задание: Написать код, который выполняет следующее: если дробь является
  неправильной, то вывести в консоль соответствующую ей правильную сложную дробь.
  Например, 12/7 превращается в 1 5/7. То есть вывод для чисел 12 и 7 будет:

  1 5/7

  Во всех остальных случаях вывести "Подсчет не производится".

  Примечания:

  Неправильная дробь - у которой модуль числителя больше знаменателя (Например,
  9/4) или равен ему (Например, 9/9).

  Правильная дробь - у которой модуль числителя меньше модуля знаменателя
  (Например, 3/7).
*/
public class Task53 {
    public static void transformFraction(int num1, int num2) {
        if (num1 >= num2) {
            int whole = num1 / num2;
            int remainder = num1 % num2;

            if (remainder == 0) {
                System.out.println(whole);
            } else {
                System.out.println(whole + " " + remainder + "/" + num2);
            }
        } else {
            System.out.println("Подсчет не производится");
        }
    }

    public static void main(String[] args) {
        transformFraction(12, 7);
    }
}
