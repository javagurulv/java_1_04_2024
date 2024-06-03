package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_14_05;

class BiggerNumber {
    public int findBiggerNumber(int number1, int number2) {
        int result = number1;
        if (number1 > number2) {
            result = number1;
        } else {
            result =  number2;

        }
        return result;
    }

    public int findMax(int number1, int number2, int number3){
        int max = findBiggerNumber(number1, number2);
        max = findBiggerNumber(max, number3);
        return max;
    }
}




