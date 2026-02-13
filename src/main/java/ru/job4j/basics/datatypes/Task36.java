package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task36} представляет перестановку цифр числа.
 *
 * <p>Содержит метод для перестановки первой и последней цифры
 * входящего четырехзначного числа и вывода результата на консоль.</p>
 *
 * <p>Примеры использования: вызов метода {@link #firstLastChange(int)}
 * с различными четырехзначными числами и вывод переставленного числа
 * на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task36 {

    /**
     * Выполняет перестановку первой и последней цифры входящего
     * четырехзначного числа.
     *
     * <p>Средняя часть числа сохраняет исходный порядок цифр.</p>
     *
     * @param number четырехзначное положительное число
     */
    public static void firstLastChange(int number) {
        int first, middle, last;
        first = number / 1000;
        middle = (number / 10) % 100;
        last = number % 10;
        System.out.println(last * 1000 + middle * 10 + first);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #firstLastChange(int)}.</p>
     * <p>Вызывает метод с примерным числом и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        firstLastChange(4265);
    }
}
