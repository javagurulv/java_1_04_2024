package lv.javaguru.java1.student_anton_pereloma.lesson_7.lessoncode;




public class Sum1To100 {
    public static void main(String[] args) {
        Sum1To100 sum1To100 = new Sum1To100();
        System.out.println(sum1To100.sumOfNumbers(1,10));
    }
        public int sumOfNumbers(int from, int to) {
            int sum = 0;
            for (int i = from; i <= to; i++) {
                sum = sum + i;
            }
            return sum;
        }
}
