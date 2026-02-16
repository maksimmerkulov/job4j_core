package ru.job4j.basics.branching;

/**
 * Класс {@code ShortCircuitAnd} демонстрирует принцип короткого замыкания
 * (short-circuit) логического оператора {@code &&}.
 *
 * <p>Показывает отличие логического оператора {@code &&}
 * от побитового оператора {@code &}.
 * При использовании {@code &&} второе выражение не вычисляется,
 * если результат первого уже равен {@code false}.</p>
 *
 * <p>Примеры использования: запуск программы, вызов методов {@code showA()}
 * и {@code showB()} и наблюдение вывода на консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShortCircuitAnd {

    /**
     * Выводит символ {@code A} на консоль и возвращает {@code false}.
     *
     * <p>Используется для демонстрации работы логических операторов.</p>
     *
     * @return {@code false}
     */
    public static boolean showA() {
        System.out.println("A");
        return false;
    }

    /**
     * Выводит символ {@code B} на консоль и возвращает {@code false}.
     *
     * <p>Не будет вызван при использовании оператора {@code &&},
     * если первый операнд вернул {@code false}.</p>
     *
     * @return {@code false}
     */
    public static boolean showB() {
        System.out.println("B");
        return false;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует короткое замыкание оператора {@code &&}.</p>
     * <p>Метод {@code showB()} не будет вызван, так как {@code showA()}
     * возвращает {@code false}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        if (showA() && showB()) {
            System.out.println("Это сообщение никогда не выведется");
        }
    }
}
