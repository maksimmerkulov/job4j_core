package ru.job4j.basics.loops;

/*
  Даны два целых числа a и b (a < b). Найти произведение всех целых чисел
  от a до b включительно.
*/
public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int result = 1;
        for (int i = a; i <= b; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mult(0, 2));
    }
}
