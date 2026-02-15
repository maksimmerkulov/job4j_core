package ru.job4j.basics.branching;

/**
 * Класс {@code EvenCheck} представляет проверку числа на четность.
 *
 * <p>Содержит метод для определения, является ли целое число четным,
 * используя оператор {@code %} для вычисления остатка от деления
 * и оператор {@code ==} для сравнения с нулем.</p>
 *
 * <p>Примеры использования: передать целое число в метод {@link #check(int)}
 * и получить {@code true}, если число четное, или {@code false}, если нет.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class EvenCheck {

    /**
     * Проверяет, является ли число четным.
     *
     * <p>Возвращает {@code true}, если число делится на {@code 2} без остатка,
     * и {@code false}, если остаток есть.</p>
     *
     * @param num целое число для проверки
     * @return {@code true}, если число четное, иначе {@code false}
     */
    public static boolean check(int num) {
        return num % 2 == 0;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #check(int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println(check(2));
    }
}
