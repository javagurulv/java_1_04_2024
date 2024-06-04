package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.lessoncode;

class SumArray {

    int sum(int number){
        int sum = 0 ;
        for(int i=1; i<number; i++){
            sum += i;
        }
        return sum;
    }
}
