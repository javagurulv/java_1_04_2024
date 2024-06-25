package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_6;

class VarargsExample {

    int sumVarargs(int ... numbers){
        int sum = 0;
        for (int number:numbers) {
            sum += number;
        }
        return sum;
    }

}
