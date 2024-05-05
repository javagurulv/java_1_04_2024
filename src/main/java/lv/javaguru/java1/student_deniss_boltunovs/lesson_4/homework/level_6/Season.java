package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_6;

import java.util.Scanner;

class Season {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Please input number between 1 and 12!");
       int month = scanner.nextInt();

       String season = "";

       switch (month) {
           case 12,1,2 -> season = "Winter";
           case 3,4,5 -> season = "Spring";
           case 6,7,8 -> season = "Summer";
           case 9,10,11 -> season = "Autumn";
       }

       System.out.println("season: " + season);

    }
}
