package ru.job4j.basics.console;

/**
 * Класс {@code Task16} выводит повторяющиеся символы строки
 * без перехода на новую строку.
 *
 * <p>Содержит единственный метод {@code main}, который демонстрирует
 * вывод повторяющихся символов строки на одной строке консоли.</p>
 *
 * <p>Примеры использования: запуск программы выводит строку "+++!!!!??"
 * на стандартный вывод.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task16 {

    /**
     * Точка входа в программу.
     *
     * <p>Выводит на консоль повторяющиеся символы строки
     * без перехода на новую строку.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String source = "+!?";
        System.out.print(String.valueOf(source.charAt(0)).repeat(3));
        System.out.print(String.valueOf(source.charAt(1)).repeat(4));
        System.out.print(String.valueOf(source.charAt(2)).repeat(2));
    }
}
