package ru.job4j.basics.branching;

/*
  В Java логическое условие можно записать так

  if (num > 1)
      showA();
      showB();

  и так

  if (num > 1) {
      showA();
      showB();
  }

  Отличие первого случая от второго, в том что showB() будет выполняться всегда,
  а showA() только если будет выполнено условие. Во втором, случае showA и showB
  будут выполняться только если условие выполнено. {} позволяет записать несколько
  операторов внутри. Даже если нужно записать один оператор, всегда пишите {},
  чтобы не было ошибок и путаницы.

  Поправьте ниже код, чтобы всегда вывод был только если выполнено условие.
*/
public class IfBracket {
    public static void showA() {
        System.out.println("A");
    }

    public static void showB() {
        System.out.println("B");
    }

    public static void show(int num) {
        if (num > 1) {
            showA();
            showB();
        }
    }

    public static void main(String[] args) {
        show(2);
    }
}
