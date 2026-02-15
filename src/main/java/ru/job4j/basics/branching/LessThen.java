package ru.job4j.basics.branching;

/**
 * Класс {@code LessThen} представляет проверку отношения двух чисел.
 *
 * <p>Содержит метод для проверки, является ли первое число меньше второго.
 * Результат проверки возвращается в виде значения типа {@code boolean}.</p>
 *
 * <p>Примеры использования: создание чисел,
 * вызов метода {@link #check(int, int)}
 * и вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LessThen {

    /**
     * Проверяет, меньше ли первое число второго.
     *
     * <p>Возвращает {@code true}, если {@code first} меньше {@code second},
     * иначе возвращает {@code false}.</p>
     *
     * @param first первое число для сравнения
     * @param second второе число для сравнения
     * @return {@code true}, если {@code first < second}, иначе {@code false}
     */
    public static boolean check(int first, int second) {
        return first < second;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #check(int, int)}.</p>
     * <p>Выводит результат проверки на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println(check(1, 2));
    }
}
