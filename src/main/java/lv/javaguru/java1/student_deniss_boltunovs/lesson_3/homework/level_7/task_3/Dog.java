package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_7.task_3;

class Dog {

     private String nickName;
     private int age;

     public Dog(String nickName, int age) {
          this.nickName = nickName;
          this.age = age;
     }


     public String getAge() {
          return "I'm " + this.age + " years old" ;
     }

     public String getVoice() {
          return "My nickname is " + this.nickName;
     }

     public void celebrateBirthday() {
          this.age += 1;
     }


}
