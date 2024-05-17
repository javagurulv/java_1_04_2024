package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_14_05;

 class OddNumberApp {

    public static void main(String[] args) {
        int number = 10;
        boolean isOdd = (number % 2) != 0;
        System.out.println("Number is even " + isOdd);

        OddNumber oddNumber = new OddNumber();
        System.out.println("Number is even " + oddNumber.isOdd(12));
        System.out.println("Number is even " + oddNumber.isOdd(13));
        System.out.println("Number is even " + oddNumber.isOdd(14));
        System.out.println("Number is even " + oddNumber.isOdd(15));
    }
}