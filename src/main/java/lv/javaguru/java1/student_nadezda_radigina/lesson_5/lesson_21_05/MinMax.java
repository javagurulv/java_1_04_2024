package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_21_05;

 class MinMax {

     int findMax(int number1, int number2, int number3) {
         int minMax = findMax(number1, number2);
         minMax = findMax(minMax, number3);
         return minMax;
     }


    int findMax(int number1, int number2){
        return number1 > number2 ? number1 : number2;

       /* if (int number1, int number2){
            return number1;
        } else {
            return number2;
        }*/
    }


}
