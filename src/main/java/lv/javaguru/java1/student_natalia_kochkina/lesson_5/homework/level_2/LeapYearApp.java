package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_2;

class LeapYearApp {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println(leapYear.leapOrNot(2000));
        System.out.println(leapYear.leapOrNot(1900));
        System.out.println(leapYear.leapOrNot(2500));
        System.out.println(leapYear.leapOrNot(2024));
        System.out.println(leapYear.leapOrNot(1999));
    }
}
