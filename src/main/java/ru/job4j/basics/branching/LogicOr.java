package ru.job4j.basics.branching;

/**
 * Класс {@code LogicOr} представляет проверку логического условия.
 *
 * <p>Содержит метод для определения, является ли число отрицательным
 * или нечетным.</p>
 *
 * <p>Примеры использования: вызов метода {@code check(int)}
 * для проверки чисел и вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LogicOr {

    /**
     * Проверяет, является ли число отрицательным или нечетным.
     *
     * <p>Возвращает {@code true}, если число меньше нуля
     * или остаток от деления на {@code 2} не равен нулю.</p>
     *
     * @param num проверяемое число
     * @return {@code true}, если число отрицательное или нечетное,
     *         иначе {@code false}
     */
    public static boolean check(int num) {
        return num < 0 || num % 2 != 0;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@code check(int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println(check(2));
    }
}
