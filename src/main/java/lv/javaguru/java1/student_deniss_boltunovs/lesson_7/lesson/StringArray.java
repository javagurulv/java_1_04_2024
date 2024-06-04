package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class StringArray {

    public String getNumbersAsString(int numberFrom, int numberTo) {
        String array = "";
        for (int i = numberFrom; i <= numberTo; i++) {
            array = array + i;
            array = array + " ";
        }
        return array;
    }

}
