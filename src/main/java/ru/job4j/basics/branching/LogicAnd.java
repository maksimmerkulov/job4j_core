package ru.job4j.basics.branching;

/**
 * Класс {@code LogicAnd} проверяет логическое условие {@code И} для числа.
 *
 * <p>Содержит метод {@link #check(int)}, который возвращает {@code true},
 * если переданное число положительное и четное, иначе {@code false}.</p>
 *
 * <p>Примеры использования: проверка различных чисел
 * на выполнение условий положительности и четности.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LogicAnd {

    /**
     * Проверяет, что число положительное и четное.
     *
     * <p>Возвращает {@code true},
     * если {@code num > 0} и {@code num % 2 == 0}.</p>
     *
     * @param num проверяемое число
     * @return {@code true} если число положительное и четное,
     *         иначе {@code false}
     */
    public static boolean check(int num) {
        return num > 0 && num % 2 == 0;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@link #check(int)}
     * с примером числа {@code -1}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println(check(-1));
    }
}
