package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task26} представляет собой утилиту
 * для работы с положительными двузначными числами.
 *
 * <p>Содержит метод {@link #transform(int)}, который строит
 * новое число из цифр входного числа в обратном порядке,
 * увеличивает его на {@code 8} и выводит результат на консоль.</p>
 *
 * <p>Примеры использования: число {@code 37} преобразуется в {@code 73},
 * увеличивается на {@code 8} и выводится {@code 81}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task26 {

    /**
     * Преобразует двузначное число.
     *
     * <p>Метод меняет местами цифры числа, прибавляет {@code 8}
     * и выводит результат на стандартный поток вывода.</p>
     *
     * @param number положительное двузначное число
     */
    public static void transform(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num2 * 10 + num1 + 8);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #transform(int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        transform(37);
    }
}
