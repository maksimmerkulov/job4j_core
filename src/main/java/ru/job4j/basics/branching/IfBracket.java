package ru.job4j.basics.branching;

/**
 * Класс {@code IfBracket} демонстрирует использование фигурных скобок
 * в условном операторе {@code if}.
 *
 * <p>Содержит методы, которые выводят символы на консоль и показывают,
 * как выполнять несколько операторов только при выполнении условия.</p>
 *
 * <p>Примеры использования: вызов метода {@link #show(int)} для проверки,
 * выполняется ли вывод символов {@code A} и {@code B} при значении числа
 * больше {@code 1}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IfBracket {

    /**
     * Выводит символ {@code A} на консоль.
     */
    public static void showA() {
        System.out.println("A");
    }

    /**
     * Выводит символ {@code B} на консоль.
     */
    public static void showB() {
        System.out.println("B");
    }

    /**
     * Выводит символы {@code A} и {@code B}, если число больше {@code 1}.
     *
     * <p>Оба метода {@link #showA()} и {@link #showB()} выполняются только
     * при выполнении условия {@code num > 1}.</p>
     *
     * @param num проверяемое число
     */
    public static void show(int num) {
        if (num > 1) {
            showA();
            showB();
        }
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@link #show(int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        show(2);
    }
}
