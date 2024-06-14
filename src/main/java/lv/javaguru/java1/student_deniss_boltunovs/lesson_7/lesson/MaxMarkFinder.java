package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.lesson;

class MaxMarkFinder {

    int findMaxMark(int[] marks) {
        if (!isEmptyArray(marks)) {
            int maxMark = marks[0];
            int i = 0;
            while (i < marks.length) {
                maxMark = Math.max(maxMark, marks[i]);
                i++;
            }
            return maxMark;
        } else {
            return 0;
        }
    }

    boolean isEmptyArray(int[] marks) {
        return (marks == null) || (marks.length == 0) ;
    }

}


