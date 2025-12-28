package ru.job4j.basics.branching;

/*
  Ниже представлен метод squareOrRectangle(int a, int b), который принимает 2
  целых положительных числа, которые должны быть смежными сторонами квадрата или
  прямоугольника.

  Задание: Написать код, который определяет к какой из указанных фигур относятся
  входящие значения, и выводит в консоль "Квадрат", если это квадрат, или
  "Прямоугольник", если это прямоугольник.

  Например, для чисел 10, 12 вывод будет:

  Прямоугольник
*/
public class Task69 {
    public static void squareOrRectangle(int a, int b) {
        if (a > 0 && b > 0) {
            if (a == b) {
                System.out.println("Квадрат");
            } else {
                System.out.println("Прямоугольник");
            }
        }
    }

    public static void main(String[] args) {
        squareOrRectangle(10, 12);
    }
}
