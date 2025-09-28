package ru.job4j.basics.datatypes;

import java.util.Locale;

/*
  У Васи есть некоторая сумма денег в рублях. Родители на день рождения добавили
  ему еще немного денег в рублях.

  Задача: написать код, который считает сумму всех денег, которые теперь есть у
  Васи, и преобразует их в евро.

  Ниже представлен метод sumAndConvert(double money, double gift, double ratio),
  который принимает 3 параметра: money - начальные деньги Васи, gift - деньги,
  подаренные родителями, ratio - отношение рубля к евро.

  Примечания: Актуальный курс евро можно найти в любом поисковике по запросу
  "курсы валют", но на решение задачи его актуальность не влияет.

  Для удобства команда System.out.printf("%.2f", euro); выводит на печать
  полученное значение с округлением до двух символов после запятой.
*/
public class Task19 {
    public static void sumAndConvert(double money, double gift, double ratio) {
        double euro = (money + gift) * ratio;
        System.out.printf(Locale.US, "%.2f", euro);
    }
}
