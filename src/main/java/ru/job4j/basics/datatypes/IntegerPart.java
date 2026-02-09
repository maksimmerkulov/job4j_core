package ru.job4j.basics.datatypes;

/**
 * Класс {@code IntegerPart} демонстрирует получение целой части числа
 * с плавающей точкой.
 *
 * <p>Содержит единственный метод {@code main}, который приводит
 * значение типа {@code float} к типу {@code int}
 * и выводит результат на консоль.</p>
 *
 * <p>Примеры использования: запуск программы выводит
 * целую часть числа {@code 2.6}, полученную с помощью приведения типов.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class IntegerPart {

    /**
     * Точка входа в программу.
     *
     * <p>Приводит число с плавающей точкой к целому типу
     * и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        float floatNum = 2.6f;
        int integerNum = (int) floatNum;
        System.out.println(integerNum);
    }
}
