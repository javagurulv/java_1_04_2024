package lv.javaguru.student_maksims_latkovskis.level_5_methods.lessoncode;

class CalculatorApp {

    public static void main(String[] args){
        int number= 5;
        int number2=6;

        Calculator calculator = new Calculator();

        boolean even = calculator.isEven(number);
        boolean odd = calculator.isOdd(number);
        double average = calculator.averageOfTwo(number, number2);
        double max = calculator.maxOfTwo(number, number2);

        System.out.println("The number is even?: " + even);
        System.out.println("The number is odd?: " + odd);
        System.out.println("Average is: " + average);
        System.out.println("Max is: " + max);


    }
}
