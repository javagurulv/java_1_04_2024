package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode;

class Sum1To100 {

    public int sum1To100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        return sum;
    }

}
