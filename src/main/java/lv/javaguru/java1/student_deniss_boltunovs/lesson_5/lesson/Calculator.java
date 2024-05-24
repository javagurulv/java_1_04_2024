package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

class Calculator {

    public void isEvenNumber(int number) {
        boolean isEven = (number % 2) == 0;
        System.out.println(number + " is even? : " + isEven);
    }

    public void isOddNumber(int number) {
        boolean isOdd = (number % 2) != 0;
        System.out.println(number + " is odd? : " + isOdd);
    }

    public double calculateAverage(int number1, int number2) {
        int sum = number1 + number2;
        return sum / (double) 2;
    }

    //  method overloading
//    public double calculateAverage(double number1) {
//        double sum = number1 ;
//        return sum / 2;
//    }


}
