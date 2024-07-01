package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_1_intern;

import java.util.Scanner;

class WeekDay {
    public static void main(String[] args) {

        int day = new Scanner(System.in).nextInt();

        WeekDay weekDay = new WeekDay();

        System.out.println(weekDay.getDayWeek(day));
        weekDay.getDayWeekSC(day);

    }



    public String getDayWeek(int dayNum) {
        if (dayNum == 1) return "Mondey";
        else if (dayNum == 2) return "Tuesday";
        else if (dayNum == 3) return "Wednesday";
        else if (dayNum == 4) return "Thursday";
        else if (dayNum == 5) return "Friday";
        else if (dayNum == 6) return "Saturday";
        else if (dayNum == 6) return "Sunday";
        else return "Не то(";
    }
    public void getDayWeekSC(int dayNum) {
        switch (dayNum) {
            case 1 :
                System.out.println("Mondey");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Не то(");

        }
    }

}
