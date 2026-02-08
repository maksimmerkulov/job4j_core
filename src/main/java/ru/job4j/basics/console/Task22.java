package ru.job4j.basics.console;

/**
 * Класс {@code Task22} демонстрирует вставку имени пользователя
 * в приветственное сообщение.
 *
 * <p>Содержит статический метод {@code nameInsert}, который формирует
 * приветствие и выводит его на консоль.</p>
 *
 * <p>Примеры использования: запуск программы вызывает метод {@code nameInsert}
 * с именем пользователя и выводит сообщение "Привет, <имя>!" на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task22 {

    /**
     * Формирует приветственное сообщение с указанным именем
     * и выводит его на консоль.
     *
     * @param name имя пользователя
     */
    public static void nameInsert(String name) {
        String result = String.format("Привет, %s!", name);
        System.out.println(result);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Вызов метода {@code nameInsert} с именем "Николай"
     * для демонстрации работы метода и вывода приветствия.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        nameInsert("Николай");
    }
}
