package lv.javaguru.java1.student_svetlana_bodnarska.lesson_3.homework.level_7_senior.Task_3;

class Dog
{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void voice(){
        System.out.println("My nickname is " + name);

    }

    public void birthday(){
        System.out.println(age + 1);
    }
    public void age(){
        System.out.println("I am " + age + " years old dog");

    }
}
