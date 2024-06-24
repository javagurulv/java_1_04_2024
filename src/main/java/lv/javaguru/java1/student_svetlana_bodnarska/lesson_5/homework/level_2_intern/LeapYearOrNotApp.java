package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_2_intern;

class LeapYearOrNotApp
{
    public static void main(String[] args) {

        LeapYearOrNot leapYearOrNot = new LeapYearOrNot();

        System.out.println("Leap Year 2024 - " + leapYearOrNot.detectLeapYear(2024));
        System.out.println("Leap Year 2028 - " + leapYearOrNot.detectLeapYear(2028));
        System.out.println("Non-leap Year 1700 - " + leapYearOrNot.detectLeapYear(1700));
        System.out.println("Non-leap Year 1900 - " + leapYearOrNot.detectLeapYear(1900));



    }
}
