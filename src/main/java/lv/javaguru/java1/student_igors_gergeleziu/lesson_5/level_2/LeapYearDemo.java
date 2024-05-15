package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_2;

class LeapYearDemo {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("1700: " + leapYear.leapYearCheck(1700));
        System.out.println("1800: " + leapYear.leapYearCheck(1800));
        System.out.println("1900: " + leapYear.leapYearCheck(1900));
        System.out.println("1600: " + leapYear.leapYearCheck(1600));
        System.out.println("2000: " + leapYear.leapYearCheck(2000));
        System.out.println("2100: " + leapYear.leapYearCheck(2100));
        System.out.println("2024: " + leapYear.leapYearCheck(2024));


    }
}
