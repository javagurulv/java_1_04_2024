package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_1_intern;

class FizzBuzzApp {
    public static void main(String[] args) {

        FizzBuzz firstNumber = new FizzBuzz();

        System.out.println(firstNumber.toFizzBuzz(15));
        System.out.println(firstNumber.toFizzBuzz(17));
        System.out.println(firstNumber.toFizzBuzz(11));
        System.out.println(firstNumber.toFizzBuzz(5));
        System.out.println(firstNumber.toFizzBuzz(1));
        System.out.println(firstNumber.toFizzBuzz(3));
        System.out.println(firstNumber.toFizzBuzz(0));
    }
}
