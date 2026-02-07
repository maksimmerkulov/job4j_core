package ru.job4j.basics.console;

import java.util.Scanner;

/**
 * Класс {@code Task13} выполняет арифметические операции с двумя числами,
 * введенными с консоли.
 *
 * <p>Содержит единственный метод {@code main}, который считывает два числа
 * с помощью {@link Scanner} и выводит результаты сложения, вычитания,
 * умножения и деления на консоль.</p>
 *
 * <p>Примеры использования: запуск программы, ввод двух чисел
 * и вывод четырех результатов на стандартный вывод.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task13 {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает два числа с консоли, вычисляет их сумму, разность,
     * произведение и частное, выводит результаты на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
