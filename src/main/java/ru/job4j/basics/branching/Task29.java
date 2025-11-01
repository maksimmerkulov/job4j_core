package ru.job4j.basics.branching;

/*
  Ниже представлен метод triangleCheck(double side1, double side2, double
  hypotenuse), который принимает 3 числа - 2 катета и гипотенузу прямоугольного
  треугольника соответственно.

  Задание: Написать код, который проверяет соответствие 3 введенных параметров
  на предмет того, что они должны быть 2 катетами и гипотенузой прямоугольного
  треугольника, и выводит в консоль "Да", если соответствуют, иначе вывести
  "Нет".

  В прямоугольном треугольнике сумма квадратов катетов равна квадрату гипотенузы:
  a^2 + b^2 = c^2, где a и b — катеты треугольника (стороны, пересекающиеся под
  прямым углом), с — гипотенуза треугольника.

  Примечание: По умолчанию подразумевается, что входящие числа - положительные.
*/
public class Task29 {
    public static void triangleCheck(double side1,
                                     double side2,
                                     double hypotenuse) {
        if (Math.abs(side1 * side1
                + side2 * side2
                - hypotenuse * hypotenuse) < 0.0001) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        triangleCheck(3, 4, 5);
    }
}
