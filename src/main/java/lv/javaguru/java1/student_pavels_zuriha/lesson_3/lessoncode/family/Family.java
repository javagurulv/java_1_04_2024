package lv.javaguru.java1.student_pavels_zuriha.lesson_3.lessoncode.family;

class Family {

    private Mother mother;
    private Child child;
    private Father father;

    public Family(Mother mother, Child child, Father father){
        this.mother = mother;
        this.child = child;
        this.father = father;

    }

    Mother getMother() {
        return this.mother;

    }

    Father getFather() {
        return this.father;

    }

    Child getChild() {
        return this.child;
    }

}

class FamilyApp {

    public static void main(String[] args) {

        Mother mother1 = new Mother ("Elena", "Pupkina", 30);
        Mother mother2 = new Mother("Elena2", "Pupkina2", 35);
        Father father1 = new Father("Vasya", "Pupkin", 32);
        Father father2 = new Father("Vasya2", "Pupkin2", 38);
        Child child1 = new Child("Kid", "Pupkin", 6);
        Child child2 = new Child("Kid1", "Pupkin", 7);

        Family family1 = new Family(mother1, child1, father1);
        Family family2 = new Family(mother2, child2, father2);


        System.out.println("First family Mother: " + family1.getMother().getFirstName() + " " + family1.getMother().getLastName() + " " + family1.getMother().getAge());
    }


}
