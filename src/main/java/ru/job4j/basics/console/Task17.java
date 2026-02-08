package ru.job4j.basics.console;

/**
 * Класс {@code Task17} демонстрирует вывод числа и его степеней на консоль.
 *
 * <p>Содержит единственный метод {@code main}, который выводит число,
 * его квадрат и куб на стандартный вывод.</p>
 *
 * <p>Примеры использования: запуск программы выводит число 6,
 * его квадрат 36 и куб 216 на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task17 {

    /**
     * Точка входа в программу.
     *
     * <p>Выводит число, его квадрат и куб на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        System.out.println(x * x);
        System.out.println(x * x * x);
    }
}
