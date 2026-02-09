package ru.job4j.basics.datatypes;

import java.util.Scanner;

/**
 * Класс {@code IntType} демонстрирует ввод и вывод целого числа.
 *
 * <p>Содержит единственный метод {@code main}, который считывает
 * целое число с клавиатуры и выводит его на консоль.</p>
 *
 * <p>Примеры использования: запуск программы, ввод числа
 * и вывод введенного значения на стандартный вывод.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IntType {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает целое число из стандартного ввода
     * и выводит его на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println(value);
    }
}
