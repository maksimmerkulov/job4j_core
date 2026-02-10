package ru.job4j.basics.datatypes;

import java.util.Locale;
import java.util.Scanner;

/**
 * Класс {@code Task11} представляет конвертер длины из сантиметров в дюймы.
 *
 * <p>Содержит вычисление длины в дюймах
 * на основе введенного значения (в сантиметрах)
 * и вывод результата с точностью до двух знаков после запятой.</p>
 *
 * <p>Примеры использования: ввод значения длины в сантиметрах,
 * преобразование в дюймы и вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task11 {

    /**
     * Точка входа в программу.
     *
     * <p>Считывает значение длины в сантиметрах, выполняет перевод в дюймы
     * и выводит результат.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int centimeters = input.nextInt();
        double inches = centimeters / 2.54;
        System.out.printf(Locale.US, "%.2f", inches);
    }
}
