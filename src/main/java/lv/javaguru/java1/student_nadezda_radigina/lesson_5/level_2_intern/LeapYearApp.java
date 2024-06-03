package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_2_intern;

 class LeapYearApp {

         public static void main(String[]args){
             LeapYear leapYear = new LeapYear();
             System.out.println(leapYear.isOrdinaryLeap(1900));
             System.out.println(leapYear.isOrdinaryLeap(2000));
             System.out.println(leapYear.isOrdinaryLeap(2024));
             System.out.println(leapYear.isOrdinaryLeap(1973));
             System.out.println();

             System.out.println(leapYear.isOrdinaryLeap(2000));
             System.out.println(leapYear.isOrdinaryLeap(2024));
             System.out.println(leapYear.isOrdinaryLeap(1992));
             System.out.println(leapYear.isOrdinaryLeap(1900));
}
 }
