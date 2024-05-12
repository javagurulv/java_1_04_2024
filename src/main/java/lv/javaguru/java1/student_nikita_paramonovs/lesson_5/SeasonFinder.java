package lv.javaguru.java1.student_nikita_paramonovs.lesson_5;

import java.util.Scanner;

class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month (1-12):");
        int month = scanner.nextInt();

        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
          season = "Winter";

              break;
            case 3:
            case 4:
            case 5:
          season = "Spring";

              break;
            case 6:
            case 7:
            case 8:
          season = "Summer";

              break;
            case 9:
            case 10:
            case 11:
          season = "Autumn";

              break;
            default:
                season = "Invalid month";

        }
        System.out.println("The Season is: " + season );





    }
}
