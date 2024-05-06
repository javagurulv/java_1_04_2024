package lv.javaguru.java1.student_nadezda_radigina.lesson3.level_7_senior;

 class DogDemo {
     public static void main(String[] args){
         Dog dog = new Dog ("Molly", 4);
         System.out.println(dog.voice());
         System.out.println(dog.getAge());
         dog.birthday();
         dog.birthday();

         System.out.println(dog.getAge());


     }
}
