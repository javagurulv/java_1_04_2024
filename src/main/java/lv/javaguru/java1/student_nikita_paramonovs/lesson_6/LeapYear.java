package lv.javaguru.java1.student_nikita_paramonovs.lesson_6;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] testYears = {1900, 2000, 2004, 2019, 2020, 2024};

        for (int year : testYears) {
            System.out.println("Year: " + year + " is leap year: " + isLeapYear(year));
        }
    }
}
