package lv.javaguru.java1.student_deniss_boltunovs.lesson_2.homework.level_4;

/*
Команда System.out.println("text"); выводит указанный "text"
на консоль, и переводит курсор на новую строку.

Для того, что бы выводить текст на консоль без перевода курсора на
новую строку можно воспользоваться командой
    System.out.print("text");
эта команда распечатает текст на консоль и оставит курсор в той же строке.

Напишите программу, которая демонстрирует использование команды
    System.out.print("text");
 */

public class Print {

   public static void main(String[] args) {

       System.out.println("For this message.");
       System.out.println("We are using println." + "\n");

       System.out.print("For this message.");
       System.out.print("We are using print." + "\n");

   }
}
