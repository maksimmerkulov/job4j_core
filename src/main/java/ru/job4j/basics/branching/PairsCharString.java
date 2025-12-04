package ru.job4j.basics.branching;

/*
  Метод принимает две строки, на выходе метод должен вернуть булево значение.
  Метод необходимо реализовать таким образом, чтобы:

  1. Если обе строки пустые - метод должен вернуть true.

  2. Если первая буква первой строки равна последней букве второй строки И
  последняя буква первой строки равна первой букве второй строки - метод должен
  вернуть true.

  3. Во всех остальных случаях метод должен вернуть false.

  Для извлечения символов из строки используйте метод charAt() класса String.
*/
public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l.isEmpty() && r.isEmpty()) {
            return true;
        }

        if (l.isEmpty() || r.isEmpty()) {
            return false;
        }

        return l.charAt(0) == r.charAt(r.length() - 1)
                && l.charAt(l.length() - 1) == r.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(check("", ""));
    }
}
