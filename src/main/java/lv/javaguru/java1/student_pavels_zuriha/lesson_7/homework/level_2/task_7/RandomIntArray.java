package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_2.task_7;

class RandomIntArray {

    public int[] arrayCreationRandom() {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        return array;
    }

    public void arrayDisplay(int[] array) {
       for (int i = 0; i < arrayCreationRandom().length; i++) {
           System.out.println(array[i]);
       }
    }

}
