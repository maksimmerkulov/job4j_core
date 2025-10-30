package ru.job4j.basics.branching;

/*
  Что такое логическое выражение? Это некое утверждение, записанное в коде. В
  Java есть логические операторы.

  ==, !=, <=, >=, >, <, &&, ||, !

  Они позволяют проверить, некоторое утверждение, при чем они всегда возвращают
  результат сравнения (true/false). Выражения можно записывать в операторах
  условия, а также присваивать переменным. Синтаксис

  boolean переменная = логическое_выражение;

  Пример,

  boolean isPositive = 10 > 0; //  = true

  или

  boolean isPositive = -10 > 0 //  = false

  Ниже приведен код. Раскомментируйте его и запишите два логических условия.
  Сначала что число отрицательное, а потом что положительное.
*/
public class NegativeCondition {
    public static void main(String[] args) {
        int num = -1;
        boolean result1 = num < 0;
        boolean result2 = num > 0;
        System.out.println(result1);
        System.out.println(result2);
    }
}
