package ru.job4j.basics.branching;

/**
 * Класс {@code GreatThen} представляет проверку сравнения двух чисел.
 *
 * <p>Содержит метод для проверки, больше ли первое число второго.
 * Возвращает результат в виде значения {@code boolean}.</p>
 *
 * <p>Примеры использования: вызов метода {@link #check(int, int)}
 * с двумя числами и вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class GreatThen {

    /**
     * Проверяет, является ли первое число больше второго.
     *
     * <p>Возвращает {@code true}, если {@code first} больше {@code second},
     * иначе {@code false}.</p>
     *
     * @param first первое число для сравнения
     * @param second второе число для сравнения
     * @return {@code true} если {@code first} больше {@code second},
     *         иначе {@code false}
     */
    public static boolean check(int first, int second) {
        return first > second;
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
