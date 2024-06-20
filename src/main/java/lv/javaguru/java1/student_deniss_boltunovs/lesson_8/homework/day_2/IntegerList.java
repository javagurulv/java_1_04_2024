package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IntegerList {

   private List<Integer> list;

    IntegerList() {
        this.list = new ArrayList<>(Arrays.asList(1,2,3,4,6));
//        this.list = numbers;
    }

    List<Integer> getList() {
        return this.list;
    }

    void addToListEnd(int number) {
        this.list.add(number);
    }

    void addToListStart(int number) {
        this.list.add(0, number);
    }

    int findListSize() {
        return this.list.size();
    }

   void removeByIndex(int index) {
        if (index <= findListSize()) {
            this.list.remove(index);
        } else {
            System.out.println("\nCAN'T remove!!! Index provided is out of bonds");
        }
   }

    void removeByValue(int value) {
        if (getList().contains(value)) {
            this.list.remove(Integer.valueOf(value));
        } else {
            System.out.println("\nCAN'T remove!!! Value not found");
        }
    }

    boolean isListEmpty() {
        return list.isEmpty();
    }

    void printListElements(){
        if(!isListEmpty()){
            System.out.println("List elements: ");
            for (int elements : this.list){
                System.out.println(elements);
            }
        } else {
            System.out.println("List is empty!");
        }
    }

}
