package ru.job4j.basics.console;

/*
  Иногда может потребоваться, чтоб выводилось без перехода на новую строку.
  Обратите внимание метод System.out.println, имеет в конце ln, что с английского
  значит line, что подразумевает вывод с переходом на новую строку. Существует
  другой метод System.out.print, т.е. без ln. Он не переводит на новую строку.
  Пример,

  System.out.print("Hello World!");

  Различия можно увидеть, если заглянуть в консоль. Первый print, второй println

  Hello World!

  Hello World!
  |

  Выведите "Сегодня я молодец!" через System.out.print
*/
public class Print {
    public static void main(String[] args) {
        System.out.print("Сегодня я молодец!");
    }
}
