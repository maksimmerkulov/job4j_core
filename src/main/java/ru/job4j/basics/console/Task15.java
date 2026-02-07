package ru.job4j.basics.console;

/**
 * Класс {@code Task15} демонстрирует повторение символов строки.
 *
 * <p>Содержит единственный метод {@code main}, который выводит на консоль
 * повторяющиеся символы из исходной строки.</p>
 *
 * <p>Примеры использования: запуск программы выводит символы '+', '!', '?'
 * в количестве 3, 4 и 2 раза соответственно на стандартный вывод.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task15 {

    /**
     * Точка входа в программу.
     *
     * <p>Выводит на консоль повторяющиеся символы строки {@code source}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String source = "+!?";
        System.out.println(String.valueOf(source.charAt(0)).repeat(3));
        System.out.println(String.valueOf(source.charAt(1)).repeat(4));
        System.out.print(String.valueOf(source.charAt(2)).repeat(2));
    }
}
