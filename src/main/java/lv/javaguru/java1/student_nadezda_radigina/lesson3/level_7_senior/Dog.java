package lv.javaguru.java1.student_nadezda_radigina.lesson3.level_7_senior;

 class Dog {
     private String name;
     private int age;
     public Dog(String name, int age) {
         this.name = name;
         this.age = age;
     }

     public int getAge(){
         return this.age;
     }
     public String voice (){
         return "My nickname is " + this.name;
     }
     public void birthday(){
         this.age = this.age + 1;
     }


}
