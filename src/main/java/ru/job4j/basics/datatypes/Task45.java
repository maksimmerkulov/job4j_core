package ru.job4j.basics.datatypes;

/**
 * Класс {@code Task45} представляет обмен левых цифр двух чисел.
 *
 * <p>Содержит метод {@link #leftNumChange(int, int)}, который принимает
 * два целых положительных числа и меняет их первые (левые) цифры местами.
 * Результат выводится на консоль построчно.</p>
 *
 * <p>Примеры использования: вызов метода с числами {@code 123} и {@code 456}
 * приведет к выводу {@code 423} и {@code 156}. Можно применять
 * для любых трехзначных чисел, а также для чисел разной длины.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task45 {

    /**
     * Обменивает левые цифры двух чисел.
     *
     * <p>Первая цифра числа1 становится первой цифрой числа2 и наоборот.
     * Остальные цифры остаются без изменений. Результат выводится
     * на консоль.</p>
     *
     * @param number1 первое число
     * @param number2 второе число
     */
    public static void leftNumChange(int number1, int number2) {
        int first1, first2, num1, num2;
        first1 = number1 / 100;
        first2 = number2 / 100;
        num1 = first2 * 100 + (number1 % 100);
        num2 = first1 * 100 + (number2 % 100);
        System.out.println(num1);
        System.out.println(num2);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрация работы метода {@link #leftNumChange(int, int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        leftNumChange(123, 456);
    }
}
