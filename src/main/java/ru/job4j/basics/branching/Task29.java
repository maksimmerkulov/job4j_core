package ru.job4j.basics.branching;

/**
 * Checks if the given sides satisfy the Pythagorean theorem.
 *
 * <p>Example output for {@code side1 = 3.0}, {@code side2 = 4.0},
 * and {@code hypotenuse = 5.0}:
 * <pre>{@code
 * Yes
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task29 {

    /**
     * Prints {@code "Yes"} if sides are catheti
     * and hypotenuse of a right triangle, otherwise prints {@code "No"}.
     *
     * @param side1 the first cathetus
     * @param side2 the second cathetus
     * @param hypotenuse the hypotenuse
     */
    public static void triangleCheck(double side1, double side2,
                                     double hypotenuse) {
        boolean isRight = Math.pow(side1, 2) + Math.pow(side2, 2)
                == Math.pow(hypotenuse, 2);
        System.out.println(isRight ? "Yes" : "No");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        triangleCheck(3.0, 4.0, 5.0);
    }
}
