package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task40} представляет сдвиг числа влево по кругу.
 *
 * <p>Содержит метод {@link #leftCircleShift(int)},
 * который выполняет сдвиг цифр числа влево по кругу,
 * при этом первая цифра становится последней.</p>
 *
 * <p>Примеры использования: создание числа,
 * вызов метода {@link #leftCircleShift(int)}
 * и вывод результата на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task40 {

    /**
     * Выполняет сдвиг цифр числа влево по кругу.
     *
     * <p>Первая цифра числа перемещается на место единиц,
     * остальные сдвигаются на одну позицию влево.
     * Результат выводится на консоль.</p>
     *
     * @param number входное целое положительное четырехзначное число
     */
    public static void leftCircleShift(int number) {
        int first, lastThree;
        first = number / 1000;
        lastThree = number % 1000;
        System.out.println(lastThree * 10 + first);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #leftCircleShift(int)}.</p>
     * <p>Создает число, вызывает метод и выводит результат на консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        leftCircleShift(1234);
    }
}
