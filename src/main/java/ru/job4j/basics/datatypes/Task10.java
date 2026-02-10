package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Класс {@code Task10} представляет программу
 * для перевода температуры из Фаренгейтов в Цельсии.
 *
 * <p>Считывает значение температуры из стандартного ввода,
 * выполняет преобразование
 * и выводит результат с точностью до одного знака после запятой.</p>
 *
 * <p>Примеры использования: ввод температуры, вычисление значения по формуле
 * и вывод результата.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task10 {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает температуру в Фаренгейтах,
     * переводит ее в Цельсии и выводит результат.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = 5 * (fahrenheit - 32) / 9.0;
        System.out.printf(Locale.US, "%.1f", celsius);
    }
}
