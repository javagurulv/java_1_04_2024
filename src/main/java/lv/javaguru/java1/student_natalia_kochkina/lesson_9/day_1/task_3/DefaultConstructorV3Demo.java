package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_1.task_3;

class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 constructorV3 = new DefaultConstructorV3();

        System.out.println("name = " + constructorV3.getFullName());
        System.out.println("age = " + constructorV3.getAge());
        System.out.println("is male = " + constructorV3.isMale());
        System.out.println("is female = " + constructorV3.getFemale());
    }

}
