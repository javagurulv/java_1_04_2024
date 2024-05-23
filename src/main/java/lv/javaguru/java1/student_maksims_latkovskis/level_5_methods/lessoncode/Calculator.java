package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.lessoncode;

class Calculator {

    public boolean isEven(int number){
        return (number % 2 == 0);
    }

    public boolean isOdd(int number){
        return (number % 2 != 0);
    }

    public double averageOfTwo(int number1, int number2){
        return (number1 + number2) / 2;
    }

    public int maxOfTwo(int number1, int number2){
        if(number1>number2) {
            return number1;
        }
        else {
            return number2;
        }
    }
    public int maxOfThree(int number1, int number2, int number3){
       int result;

        if(number1>number2) {
            result = number1;
        }
        else {
            result = number2;
        }
        if(result>number3){
            return result;
        }
        else{
            return number3;
        }
    }
}
