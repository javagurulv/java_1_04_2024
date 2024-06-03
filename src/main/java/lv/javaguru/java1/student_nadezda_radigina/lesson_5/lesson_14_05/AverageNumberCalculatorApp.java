package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_14_05;

class AverageNumberCalculatorApp {

    public static void main(String[] args){
        AverageNumberCalculator calculator = new AverageNumberCalculator();
        System.out.println("Average = " + calculator.findAverage(10,20));
        System.out.println("Average = " + calculator.findAverage(15,111));
        System.out.println("Average = " + calculator.findAverage(777,20));
        System.out.println("Average = " + calculator.findAverage(7,8));
        System.out.println("Average = " + calculator.findAverageDouble(548,745));
        System.out.println("Average = " + calculator.findAverageDouble(7,8));


    }


}
