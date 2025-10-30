package ru.job4j.basics.branching;

/*
  Операторы & и && - очень похожи, так же как и операторы | и ||. Так в чем же
  разница? & и | это побитовые операции. Бинарное умножение и сумма соответственно.
  Сколько операндов нужно для умножения и сложения? Два, а их еще нужно рассчитать.
  Поэтому если писать так, то оба выражения будут рассчитываться всегда.

  if (showA() & showB()) {

  }

  Методы

  public static boolean showA() {
      System.out.println("A");
      return false;
  }

  public static boolean showB() {
      System.out.println("B");
      return false;
  }

  Обратите внимание методы возвращают false. Несмотря на это всегда будет
  выведено "AB".

  Если написать &&, то будет выведено только "A", потому что первое выражение
  вернуло false. Дело в том, что компилятор оптимизирует выражения. Если
  вернулось false, то уже не имеет смысла проверять дальше. Аналогично true для
  ||.

  Запомните, всегда пишите && и || в логических выражениях.

  Ниже приведен код. Его нужно поправить.
*/
public class ShortCircuitAnd {
    public static boolean showA() {
        System.out.println("A");
        return false;
    }

    public static boolean showB() {
        System.out.println("B");
        return false;
    }

    public static void main(String[] args) {
        if (showA() && showB()) {
            System.out.println("Это сообщение никогда не выведется");
        }
    }
}
