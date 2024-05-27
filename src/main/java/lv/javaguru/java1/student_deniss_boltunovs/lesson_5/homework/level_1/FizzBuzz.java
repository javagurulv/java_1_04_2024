package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_1;

class FizzBuzz {

    public String calculateFizzBuzz(int number) {
        String result;
        if (dividedByThree(number) && dividedByFive(number)) {
            result = "FizzBuzz";
        } else if (dividedByThree(number)) {
            result = "Fizz";
        } else if (dividedByFive(number)){
            result = "Buzz";
        } else {
            result = "" + number;
        }
        return result ;
    }

     private boolean dividedByThree(int number) {
         return number % 3 == 0;
     }

     private boolean dividedByFive(int number) {
         return number % 5 == 0;
     }

}
