package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_1;

import java.util.List;
import java.util.stream.Collectors;

class BusinessLogic {

    private IntegersBucket numbers;
    private DogsBucket dogs;

    BusinessLogic(){
        this.numbers = new IntegersBucket();
        this.dogs = new DogsBucket();
    }

    //////////////////////////////////////////////////////// numbers
    IntegersBucket getNumbers(){
        return this.numbers;
    }

    void addNewNumber(int number){
        this.numbers.addNumber(number);
    }

    int sumOfNumbers(){
        List<Integer> list = this.numbers.getNumbers();
        int sum = 0;
        for (int number : list){
            sum += number;
        }
        return sum;
    }

    //////////////////////////////////////////////////////// dogs
    DogsBucket getDogs(){
        return this.dogs;
    }

    void addNewDog(String name, String colour, int age) {
        Dog dog = new Dog(name, colour, age);
        this.dogs.addDog(dog);
    }

    List<Dog> allDogs(){
       return this.dogs.getDogsList();
    }

    List<Dog> selectedDogs(String colour){
        return allDogs().stream()
                .filter(dog -> dog.getColour().equals(colour))
                .collect(Collectors.toList());
    }


}
