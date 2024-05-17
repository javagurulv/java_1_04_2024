package lv.javaguru.java1.student_nadezda_radigina.lesson_5.level_1_intern;

 class FizzBuzz {

         public String isFizz(int number1){
             if ((number1 % 3) == 0){
                 return "Fizz";
             }
             return null;
         }
         public String isBuzz(int number2){
             if ((number2 % 5) == 0){
                 return "Buzz";
             }
             return null;
         }
         public String isFizzBuzz (int number3) {
             if (((number3 % 3) == 0) && ((number3 % 5) == 0)) {
                 return "FizzBuzz";

             } else if (((number3 % 3) != 0) && ((number3 % 5) != 0)) {
                 return "" + number3;
             } else
                 return null;
         }
 }
