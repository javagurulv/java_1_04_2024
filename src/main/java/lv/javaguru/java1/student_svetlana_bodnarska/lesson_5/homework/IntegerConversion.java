package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework;

class IntegerConversion {

  String dividingNumbers (int number) {
    if ((number % 3 == 0) && (number % 5 == 0)) {
      return "FizzBuzz";
    } else if (number % 3 == 0) {
      return "Fizz";
    } else if (number % 5 == 0) {
      return "Buzz";
    }
    return "" + number;
  }

}