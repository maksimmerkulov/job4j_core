package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task16} представляет инструмент
 * для последовательного уменьшения числа на {@code 1} — три раза.
 *
 * <p>Содержит метод {@link #decreaseBy2(int)}, который выводит на консоль
 * три значения, каждое на {@code 1} меньше предыдущего,
 * начиная с заданного числа.</p>
 *
 * <p>Примеры использования: передача числа в метод {@link #decreaseBy2(int)}
 * и вывод последовательности уменьшенных значений на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task16 {

    /**
     * Уменьшает переданное число на {@code 1} — три раза
     * и выводит каждое значение на консоль.
     *
     * @param number число, которое необходимо уменьшить
     */
    public static void decreaseBy2(int number) {
        int a, b, c;
        a = number - 1;
        b = a - 1;
        c = b - 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #decreaseBy2(int)}.</p>
     * <p>Вызывает метод с числом {@code 6} и выводит результаты на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        decreaseBy2(6);
    }
}
