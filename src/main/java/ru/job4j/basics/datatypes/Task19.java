package ru.job4j.basics.datatypes;

import java.util.Locale;

/**
 * Класс {@code Task19} представляет утилиту конвертации денежных средств.
 *
 * <p>Содержит метод для сложения двух денежных сумм
 * и перевода результата в евро по заданному курсу.</p>
 *
 * <p>Примеры использования: вызов метода для расчета итоговой суммы
 * после получения подарка и последующей конвертации валюты.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task19 {

    /**
     * Выполняет сложение двух денежных сумм
     * и выводит результат конвертации в евро.
     *
     * <p>Результат выводится на консоль
     * с точностью до двух знаков после запятой в формате {@link Locale#US}.</p>
     *
     * @param money исходная сумма денег.
     * @param gift сумма подарка.
     * @param ratio курс конвертации в евро.
     */
    public static void sumAndConvert(double money, double gift, double ratio) {
        double euro = (money + gift) * ratio;
        System.out.printf(Locale.US, "%.2f", euro);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу
     * метода {@link #sumAndConvert(double, double, double)}.</p>
     *
     * @param args аргументы командной строки (не используется)
     */
    public static void main(String[] args) {
        sumAndConvert(5000, 7000, 0.016516);
    }
}
