package ru.job4j.basics.datatypes;

import java.util.Scanner;

/**
 * Класс {@code Task9} представляет демонстрационную программу
 * для выполнения базовых арифметических операций.
 *
 * <p>Содержит чтение двух целых чисел из консоли
 * и вывод результатов сложения, вычитания, умножения и деления.</p>
 *
 * <p>Примеры использования: ввод двух чисел через консоль,
 * выполнение арифметических операций и вывод результатов.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task9 {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает два целых числа с помощью {@link Scanner},
     * выполняет арифметические операции и выводит результаты на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
