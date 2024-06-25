package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_6;

class VarargsExampleDemo {

    public static void main(String[] args) {

        VarargsExample varargsExample = new VarargsExample();

        /// should be 11
        int sum1 = varargsExample.sumVarargs(5,6);
        System.out.println("Sum1: " + sum1);

        //// should be 17
        int sum2 = varargsExample.sumVarargs(1,6,10);
        System.out.println("Sum2: " + sum2);
    }

}
