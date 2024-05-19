package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_7_senior;

class Dog{

    private String dogsName;
    private int dogsAge;

    Dog(String dogsName, int dogsAge){
        this.dogsName = dogsName;
        this.dogsAge = dogsAge;
    }

    void bark(){
        System.out.println("My nickname is " + this.dogsName);
    }

    void celebrateBirthday(){
        this.dogsAge++;
    }

    int getDogsAge(){
        return this.dogsAge;
    }

}

class DogApp{

    public static void main(String[] args){

        Dog scoobyDoo = new Dog("Scooby", 10 );
        scoobyDoo.bark();
        scoobyDoo.celebrateBirthday();
        System.out.println("The current dog's age is: " + scoobyDoo.getDogsAge());
    }
}
