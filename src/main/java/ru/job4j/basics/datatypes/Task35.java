package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task35} представляет перестановку цифр числа.
 *
 * <p>Содержит метод для перестановки первой и последней цифры
 * входящего трехзначного числа и вывода результата на консоль.</p>
 *
 * <p>Примеры использования: создается число,
 * вызывается метод {@link #firstLastChange(int)}
 * и результат выводится на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task35 {

    /**
     * Выполняет перестановку первой и последней цифры
     * входящего трехзначного числа.
     *
     * <p>Средняя цифра (десятки) остается на месте, а первая
     * (сотни) и последняя (единицы) меняются местами.</p>
     *
     * @param number входящее трехзначное число
     */
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number / 10) % 10;
        num3 = number % 10;
        System.out.println(num3 * 100 + num2 * 10 + num1);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@link #firstLastChange(int)}.</p>
     * <p>Создает число, вызывает метод и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        firstLastChange(125);
    }
}
