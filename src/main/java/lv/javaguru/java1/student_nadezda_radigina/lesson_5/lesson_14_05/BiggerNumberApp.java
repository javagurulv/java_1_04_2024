package lv.javaguru.java1.student_nadezda_radigina.lesson_5.lesson_14_05;

public class BiggerNumberApp {

    public static void main(String[] args){
        BiggerNumber biggerNumber = new BiggerNumber();
        System.out.println("Bigger number: " + biggerNumber.findBiggerNumber(12, 15));
        System.out.println("Bigger number: " + biggerNumber.findBiggerNumber(14, 77));
        System.out.println("Bigger number: " + biggerNumber.findBiggerNumber(70, 80));
        System.out.println("Bigger number: " + biggerNumber.findBiggerNumber(32, 18));

        System.out.println("Bigger number: " + biggerNumber.findMax(32, 18, 250));
        System.out.println("Bigger number: " + biggerNumber.findMax(180, 108, 462));
    }
}
