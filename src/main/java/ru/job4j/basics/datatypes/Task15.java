package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task15} представляет инструмент
 * для последовательного увеличения числа на {@code 2} — три раза.
 *
 * <p>Содержит метод {@link #increaseBy2(int)}, который принимает целое число,
 * увеличивает его три раза на {@code 2} и возвращает результат в виде строки,
 * разделенной запятыми.</p>
 *
 * <p>Примеры использования: создание числа,
 * вызов метода {@link #increaseBy2(int)} и вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task15 {

    /**
     * Увеличивает переданное число на {@code 2} — три раза.
     *
     * <p>Возвращает строку с тремя значениями, разделенными запятыми:
     * первое число увеличено на {@code 2}, второе число увеличено на {@code 4},
     * третье число увеличено на {@code 6} по сравнению с исходным.</p>
     *
     * @param number исходное целое число
     * @return строка с тремя числами, разделенными запятыми
     */
    public static String increaseBy2(int number) {
        int a, b, c;
        a = number + 2;
        b = a + 2;
        c = b + 2;
        return a + ", " + b + ", " + c;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@link #increaseBy2(int)}:
     * создается число, вызывается метод и результат выводится на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        int input = 6;
        String output = increaseBy2(input);
        System.out.println(input);
        System.out.println(output);
    }
}
