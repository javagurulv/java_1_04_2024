package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_1;

class OneToTen {

    public int[] forMethod(int length) {
        int[] array = new int[length];

        for (int i = 1; i <= array.length; i++) {
            System.out.print(i + " ");
        }
        return array;
    }
}
