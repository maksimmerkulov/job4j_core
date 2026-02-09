package ru.job4j.basics.datatypes;

import java.util.Scanner;

/**
 * Класс {@code ShortType} демонстрирует чтение значения типа {@code short}
 * из стандартного ввода и его вывод на консоль.
 *
 * <p>Содержит единственный метод {@code main}, который считывает значение
 * типа {@code short} и выводит его на стандартный вывод.</p>
 *
 * <p>Примеры использования: запуск программы, ввод значения
 * и получение его на стандартном выводе.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShortType {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает значение типа {@code short} из стандартного ввода
     * и выводит его на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short value = in.nextShort();
        System.out.println(value);
    }
}
