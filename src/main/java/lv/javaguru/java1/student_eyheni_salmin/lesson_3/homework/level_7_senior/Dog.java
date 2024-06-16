package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_7_senior;

class Dog {
    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }
    public void dogVoice() {
        System.out.println("My nickname is " + dogName);
    }

    private void setDogAgePlus() {
        dogAge +=1;
    }
    public void dogBirthday() {
        setDogAgePlus();
        System.out.println("Yeah... It`s my birthday. I`m " + dogAge + " years old!");
    }




}
