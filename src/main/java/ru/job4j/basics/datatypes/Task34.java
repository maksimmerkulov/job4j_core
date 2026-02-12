package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task34} представляет счетчик четных цифр в четырехзначном числе.
 *
 * <p>Содержит метод {@link #evenAmount(int)}, который подсчитывает
 * количество четных цифр во входящем числе и выводит результат на консоль.</p>
 *
 * <p>Примеры использования: вызов метода {@link #evenAmount(int)}
 * для подсчета четных цифр числа и вывод результата.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task34 {

    /**
     * Подсчитывает количество четных цифр в четырехзначном числе.
     *
     * <p>Для вычислений используются арифметические операции:
     * деление, взятие остатка и базовые операции.</p>
     *
     * @param number положительное четырехзначное число
     */
    public static void evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;
        num1 = number / 1000;
        num2 = (number / 100) % 10;
        num3 = (number / 10) % 10;
        num4 = number % 10;
        counter = -((num1 % 2 - 1) + (num2 % 2 - 1) + (num3 % 2 - 1)
                + (num4 % 2 - 1));
        System.out.println(counter);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #evenAmount(int)}.</p>
     * <p>Создает пример числа и выводит количество его четных цифр
     * на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        evenAmount(4012);
    }
}
