package ru.job4j.basics.console;

/**
 * Класс {@code Task21} демонстрирует вывод информации о пользователе
 * в виде рамки из символов {@code *}.
 *
 * <p>Содержит единственный метод {@code main}, который выводит
 * полное имя пользователя и номер телефона, оформленные в рамку с шириной,
 * равной максимальной длине строки.</p>
 *
 * <p>Примеры использования: запуск программы выводит на консоль:
 * полное имя и номер телефона, заключенные в рамку из символов {@code *}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task21 {

    /**
     * Точка входа в программу.
     *
     * <p>Формирует рамку вокруг полного имени и номера телефона
     * и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String fullName = "Фамилия Имя Отчество";
        String phoneNumber = "+7(938) 123-45-67";
        int width = Math.max(fullName.length(), phoneNumber.length());
        System.out.println("*".repeat(width + 4));
        System.out.println(
                "* "
                        + fullName
                        + " ".repeat(width - fullName.length())
                        + " *"
        );
        System.out.println(
                "* "
                        + phoneNumber
                        + " ".repeat(width - phoneNumber.length())
                        + " *"
        );
        System.out.print("*".repeat(width + 4));
    }
}
