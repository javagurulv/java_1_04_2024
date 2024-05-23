package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_2_intern;

class LeapYearCalculatorApp {
    public static void main(String[] args) {
        LeapYearCalculator year = new LeapYearCalculator();
        System.out.println(year.isLeapYear(1993));
        System.out.println(year.isLeapYear(0));
        System.out.println(year.isLeapYear(2000));
        System.out.println(year.isLeapYear(2012));
        System.out.println(year.isLeapYear(1700));
        System.out.println(year.isLeapYear(400));
    }
}