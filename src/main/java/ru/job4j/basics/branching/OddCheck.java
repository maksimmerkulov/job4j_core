package ru.job4j.basics.branching;

/**
 * Класс {@code OddCheck} проверяет, является ли число нечетным.
 *
 * <p>Содержит метод {@link #check(int)}, который принимает целое число
 * и возвращает {@code true}, если число нечетное,
 * и {@code false} в противном случае.</p>
 *
 * <p>Примеры использования: проверка чисел на четность/нечетность
 * с выводом результатов на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class OddCheck {

    /**
     * Проверяет, что переданное число является нечетным.
     *
     * <p>Результат вычисляется с использованием операторов
     * {@code %} и {@code !=}.</p>
     *
     * @param num целое число для проверки
     * @return {@code true} если число нечетное, иначе {@code false}
     */
    public static boolean check(int num) {
        return num % 2 != 0;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #check(int)}.</p>
     * <p>Выводит результат проверки числа {@code 2} на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println(check(2));
    }
}
