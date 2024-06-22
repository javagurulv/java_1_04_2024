package lv.javaguru.java1.student_maksims_latkovskis.level_8_project_school_diary.homework.day_4;

import java.util.ArrayList;
import java.util.List;

class MillionObjects {

    public static void main(String[] args) {
       MillionObjects millionObjects = new MillionObjects();

        List longArray1 = millionObjects.fillArray(1000000);
       // List longArray2 = millionObjects.fillArray(1000000000);

        System.out.println("The size of the first array is: " + longArray1.size());
    //    System.out.println("The size of the second array is: " + longArray2.size());
        System.out.println("It is better not to make the List entity of the size that exceeds the allocated heap size, which might be low on the personal machines");
    }

    List fillArray(int numberOfElements){
        List<Integer> longArray = new ArrayList<Integer>();
        for(int i = 0; i< numberOfElements; i++) longArray.add(0);
        return longArray;
    }

}
