package ru.job4j.basics.branching;

/**
 * Класс {@code Game} представляет проверку выгодности игры.
 *
 * <p>Содержит метод для вычисления ожидаемой прибыли
 * на основе вероятности выигрыша, стоимости приза и цены игры.</p>
 *
 * <p>Примеры использования:
 * вызов метода {@link Game#checkGame(double, int, int)} для определения,
 * стоит ли участвовать в игре.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Game {

    /**
     * Вычисляет ожидаемую прибыль от участия в игре.
     *
     * <p>Если произведение вероятности выигрыша на стоимость приза
     * больше цены игры, возвращается чистая прибыль.
     * В противном случае возвращается {@code 0}.</p>
     *
     * @param percent вероятность выигрыша
     * @param prize стоимость приза
     * @param pay цена участия в игре
     * @return чистая прибыль или {@code 0}, если игра невыгодна
     */
    public static int checkGame(double percent, int prize, int pay) {
        double sum = percent * prize;
        if (sum > pay) {
            return (int) (sum - pay);
        } else {
            return 0;
        }
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу
     * метода{@link Game#checkGame(double, int, int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println(checkGame(0.2, 50, 9));
    }
}
