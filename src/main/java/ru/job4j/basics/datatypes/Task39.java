package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task39} представляет утилиту.
 *
 * <p>Содержит метод для циклического сдвига цифр трехзначного числа влево
 * с выводом результата на консоль.</p>
 *
 * <p>Примеры использования:
 * вызов статического метода {@code leftCircleShift(int)}
 * для обработки числа и вывода результата.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task39 {

    /**
     * Выполняет циклический сдвиг цифр трехзначного числа влево.
     *
     * <p>Первая цифра перемещается в конец числа,
     * остальные цифры сдвигаются на одну позицию влево.</p>
     *
     * @param number трехзначное целое число
     */
    public static void leftCircleShift(int number) {
        int first, lastTwo;
        first = number / 100;
        lastTwo = number % 100;
        System.out.println(lastTwo * 10 + first);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@code leftCircleShift(int)}.</p>
     * <p>Вызывает метод и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        leftCircleShift(123);
    }
}
