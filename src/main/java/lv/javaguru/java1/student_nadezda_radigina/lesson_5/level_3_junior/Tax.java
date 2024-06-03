package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_3_junior;

 class Tax {
     public double taxRate (int sum) {
         if ((sum > 0) && (sum < 10000)) {
             return (sum * 0.03);
         } else if ((sum >= 10000) && (sum < 50000)) {
             return (sum * 0.04);
         } else if (sum >= 50000) {
             return (sum * 0.05);
         }
         return 0.0;
     }
 }






