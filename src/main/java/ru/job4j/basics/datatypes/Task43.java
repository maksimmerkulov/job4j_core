package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task43} представляет операцию обмена правых цифр
 * двух трехзначных чисел.
 *
 * <p>Содержит метод {@link #rightNumChange(int, int)}, который меняет
 * последние цифры двух чисел и выводит результат на консоль построчно.</p>
 *
 * <p>Примеры использования: передача двух трехзначных чисел,
 * вызов метода для обмена их правых цифр, вывод измененных чисел
 * на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task43 {

    /**
     * Меняет правые цифры двух трехзначных чисел.
     *
     * <p>Метод берет последнюю цифру каждого числа и меняет их местами.
     * Результирующие числа выводятся на консоль построчно.</p>
     *
     * @param number1 первое трехзначное число
     * @param number2 второе трехзначное число
     */
    public static void rightNumChange(int number1, int number2) {
        int last1, last2, num1, num2;
        last1 = number1 % 10;
        last2 = number2 % 10;
        num1 = (number1 / 10) * 10 + last2;
        num2 = (number2 / 10) * 10 + last1;
        System.out.println(num1);
        System.out.println(num2);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #rightNumChange(int, int)}.</p>
     * <p>Меняет правые цифры чисел {@code 123} и {@code 456}
     * и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        rightNumChange(123, 456);
    }
}
