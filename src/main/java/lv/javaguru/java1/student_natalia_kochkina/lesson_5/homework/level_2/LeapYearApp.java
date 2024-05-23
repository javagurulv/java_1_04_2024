package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_2;

class LeapYearApp {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("2000 = " + leapYear.isLeap(2000));
        System.out.println("1900 = " + leapYear.isLeap(1900));
        System.out.println("2500 = " + leapYear.isLeap(2500));
        System.out.println("2024 = " + leapYear.isLeap(2024));
        System.out.println("1999 = " + leapYear.isLeap(1999));
    }
}
