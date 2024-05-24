package lv.javaguru.java1.student_pavels_zuriha.lesson_7.lessoncode.task_2;

class Sum1To100Test {

    public static void main(String[] args) {

        Sum1To100Test test = new Sum1To100Test();
        test.testSum1To100();

    }

    public void testSum1To100() {

        Sum1To100 sum1To100 = new Sum1To100();
        int result = sum1To100.sum1To100(100);
        if (result == 5050) {
            System.out.println("Test OK. Result: " + result);
        } else {
            System.out.println("Test FAIL. Expected Result: 5050. Real result: " + result);
        }
    }

}
