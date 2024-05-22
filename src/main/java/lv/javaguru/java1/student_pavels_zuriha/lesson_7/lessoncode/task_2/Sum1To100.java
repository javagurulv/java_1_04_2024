package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_2;

class Sum1To100 {

    public int sum1To100(int length) {

        int[] array = new int[length];
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum += i;
        }
        return sum;
    }

}
