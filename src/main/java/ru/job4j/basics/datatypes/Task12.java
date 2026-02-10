package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Класс {@code Task12} представляет конвертер длины из дюймов в сантиметры.
 *
 * <p>Содержит вычисление длины в сантиметрах
 * на основе введенного значения (в дюймах)
 * и вывод результата с точностью до двух знаков после запятой.</p>
 *
 * <p>Примеры использования: ввод числа дюймов с клавиатуры,
 * конвертация в сантиметры и вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task12 {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает число дюймов с консоли, конвертирует его в сантиметры
     * и выводит результат на консоль с двумя знаками после запятой.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();
        double centimeters = inches * 2.54;
        System.out.printf(Locale.US, "%.2f", centimeters);
    }
}
