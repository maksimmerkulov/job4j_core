package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task41} представляет операцию
 * {@code "сдвиг числа вправо по кругу"}.
 *
 * <p>Содержит метод
 * для выполнения сдвига цифр трехзначного числа вправо по кругу,
 * при котором последняя цифра становится первой,
 * а остальные цифры смещаются на одну позицию вправо.</p>
 *
 * <p>Примеры использования: вызов метода {@link Task41#rightCircleShift(int)}
 * с трехзначными числами, вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task41 {

    /**
     * Выполняет сдвиг числа {@code number} вправо по кругу.
     *
     * <p>Последняя цифра числа становится первой, остальные цифры смещаются
     * на одну позицию вправо. Результат выводится на консоль.</p>
     *
     * @param number трехзначное положительное число
     */
    public static void rightCircleShift(int number) {
        int firstTwo, last;
        firstTwo = number / 10;
        last = number % 10;
        System.out.println(last * 100 + firstTwo);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link Task41#rightCircleShift(int)}.</p>
     * <p>Создает число, выполняет сдвиг вправо по кругу и выводит результат
     * на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        rightCircleShift(123);
    }
}
