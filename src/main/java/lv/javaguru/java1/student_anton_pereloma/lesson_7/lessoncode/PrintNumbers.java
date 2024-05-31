package lv.javaguru.java1.student_anton_pereloma.lesson_7.lessoncode;

class PrintNumbers {
    public String printNumbers(int counter) {
        String str = "";
        for (int i = 1; i <= counter; i++) {
            str = str + i;
            str = str + " ";
        }
        return str;
    }
}
