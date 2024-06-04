package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class SumArray {

    public int getSum(int numberFrom, int numberTo) {
        int sum = 0;
        for (int i = numberFrom; i <= numberTo; i++) {
            sum += i;
        }
        return sum;
    }

}
