package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Класс {@code Task13} представляет конвертер валют.
 *
 * <p>Содержит функциональность для перевода суммы в долларах США
 * в другую валюту по заданному курсу обмена.</p>
 *
 * <p>Примеры использования: программа считывает
 * количество долларов и курс с консоли, вычисляет сумму в другой валюте
 * и выводит результат с точностью до двух знаков после запятой.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task13 {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает с консоли количество долларов и курс обмена,
     * вычисляет сумму в другой валюте
     * и выводит результат с точностью до двух знаков после запятой.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollars = input.nextInt();
        String rateStr = input.next();
        double transferRate = Double.parseDouble(rateStr);
        double rslCurrency = dollars * transferRate;
        System.out.printf(Locale.US, "%.2f", rslCurrency);
    }
}
