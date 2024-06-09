package lv.javaguru.java1.student_nikita_paramonovs.lesson_6;

class FizzBuzz {
    public String DivisionResult(int number) {
        if (division3(number) && division5(number)) {
            return "FizzBuzz";
        } else if (division3(number)) {
            return "Fizz";
        } else if (division5(number)) {
            return "Buzz";
        } else {
            return "" +  number;
        }
    }

    private boolean division3(int number) {
        if ((number % 3) == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean division5(int number) {
        if ((number % 5) == 0) {
            return true;
        } else {
            return false;
        }
    }
}




