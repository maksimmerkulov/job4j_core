package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task44} представляет операцию обмена правых цифр
 * двух целых чисел.
 *
 * <p>Содержит метод {@link #rightNumChange(int, int)}, который обменивает
 * последнюю цифру первого числа с последней цифрой второго числа
 * и выводит результат на консоль построчно.</p>
 *
 * <p>Примеры использования: создание чисел,
 * вызов метода {@link #rightNumChange(int, int)}
 * и вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task44 {

    /**
     * Обменивает правые цифры двух чисел.
     *
     * <p>Метод берет последнюю цифру каждого числа и меняет их местами.
     * Результат выводится на консоль построчно.</p>
     *
     * @param number1 первое целое число
     * @param number2 второе целое число
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
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        rightNumChange(123, 4567);
    }
}
