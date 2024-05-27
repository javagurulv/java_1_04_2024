package lv.javaguru.java1.student_sergejs_temcenko.lesson_5_methods.homework.level_1_intern;

class FizzBuzzConverterApplication {


    public static void main(String[] args) {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();

        System.out.println("Division on 5 " + fizzBuzzConverter.convertToFizzBuzz(5));
        System.out.println("Division on 3 " + fizzBuzzConverter.convertToFizzBuzz(3));
        System.out.println("Division on 3 and 5 " + fizzBuzzConverter.convertToFizzBuzz(30));

        System.out.println(fizzBuzzConverter.convertToFizzBuzz(10));
        System.out.println(fizzBuzzConverter.convertToFizzBuzz(21));
        System.out.println(fizzBuzzConverter.convertToFizzBuzz(15));
    }
}
