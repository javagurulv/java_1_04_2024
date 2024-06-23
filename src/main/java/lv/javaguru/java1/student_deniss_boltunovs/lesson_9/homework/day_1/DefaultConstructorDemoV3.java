package lv.javaguru.java1.student_deniss_boltunovs.lesson_9.homework.day_1;

class DefaultConstructorDemoV3 {

    public static void main(String[] args) {
        DefaultConstructorV3 constructor = new DefaultConstructorV3();
        System.out.println("Full name: " + constructor.getFullName());
        System.out.println("Age: " + constructor.getAge());
        System.out.println("Male: " + constructor.getMale());
        System.out.println("Female: " +  constructor.getFemale());
    }

}
