package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_2_intern;

 class LeapYear {
         public String isOrdinaryLeap(int number){
             if ( ( ( number % 4 == 0 ) && ( number % 100 != 0 ) ) || ( number % 400 == 0 ) ){
                 return "Leap year";
             } else {
                 return "Ordinary year";
             }
         }
     }

