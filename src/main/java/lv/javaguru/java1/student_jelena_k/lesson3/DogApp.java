package lv.javaguru.java1.student_jelena_k.lesson3;

class DogApp {
   public static void main(String[] args) {
       Dog dog1 = new Dog("Bim", 3);
        System.out.println(dog1.sayHello());
        System.out.println(dog1.sayAge());
        dog1.happyBirthday();
        System.out.println(dog1.sayAge());
    }
}
