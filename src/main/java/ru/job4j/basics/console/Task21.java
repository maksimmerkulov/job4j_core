package ru.job4j.basics.console;

/*
  Напишите класс, который выводит на экран в одной строке ваше фамилию, имя,
  отчество, в другой ― телефон, все это ― в рамке из «звездочек».

  ************************
  * Фамилия Имя Отчество *
  * +7 938 123 45 67     *
  ************************
*/
public class Task21 {
    public static void main(String[] args) {
        String fullName = "Фамилия Имя Отчество";
        String phoneNumber = "+7(938) 123-45-67";
        int width = Math.max(fullName.length(), phoneNumber.length());
        System.out.println("*".repeat(width + 4));
        System.out.println(
                "* "
                        + fullName
                        + " ".repeat(width - fullName.length())
                        + " *"
        );
        System.out.println(
                "* "
                        + phoneNumber
                        + " ".repeat(width - phoneNumber.length())
                        + " *"
        );
        System.out.print("*".repeat(width + 4));
    }
}
