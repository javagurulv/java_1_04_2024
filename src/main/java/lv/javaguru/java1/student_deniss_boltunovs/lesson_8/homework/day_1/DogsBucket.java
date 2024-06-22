package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_1;

import java.util.ArrayList;
import java.util.List;

class DogsBucket {

    private List<Dog> dogs;

    DogsBucket() {
        this.dogs = new ArrayList<>();
    }

    List<Dog> getDogsList(){
        return this.dogs;
    }

    void addDog(Dog dog){
        this.dogs.add(dog);
    }

}
