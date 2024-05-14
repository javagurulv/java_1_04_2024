package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_1;

class FizzBuzzDemo {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println("Fizz method check: ");
        System.out.println("Number 3: "+fizzBuzz.fizzCheck(3));
        System.out.println("Number 5: "+fizzBuzz.fizzCheck(5));
        System.out.println("Number 7: "+fizzBuzz.fizzCheck(7));
        System.out.println("Number 15: "+fizzBuzz.fizzCheck(15));
        System.out.println("Buzz method check: ");
        System.out.println("Number 3: "+fizzBuzz.buzzCheck(3));
        System.out.println("Number 5: "+fizzBuzz.buzzCheck(5));
        System.out.println("Number 2: "+fizzBuzz.buzzCheck(2));
        System.out.println("Number 30: "+fizzBuzz.buzzCheck(30));
        System.out.println("FizzBuzz method check: ");
        System.out.println("Number 3: "+fizzBuzz.fizzBuzzCheck(3));
        System.out.println("Number 5: "+fizzBuzz.fizzBuzzCheck(5));
        System.out.println("Number 14: "+fizzBuzz.fizzBuzzCheck(14));
        System.out.println("Number 30: "+fizzBuzz.fizzBuzzCheck(30));


    }

}
