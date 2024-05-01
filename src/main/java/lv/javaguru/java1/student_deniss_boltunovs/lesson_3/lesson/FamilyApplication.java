package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

public class FamilyApplication {

    public static void main(String[] args) {

        FamilyMember father = new FamilyMember("Jim", "Kerry", 56);
        FamilyMember mother = new FamilyMember("Beatrice", "Kerry", 50);
        FamilyMember firstChild = new FamilyMember("Robert", "Kerry", 26);
        FamilyMember secondChild = new FamilyMember("Margaret", "Kerry", 20);

        Family family = new Family(father, mother, firstChild, secondChild);

        ///////// father information
        FamilyMember father1 = family.getFather();
        String fatherName = father1.getName();
        String fatherSurname = father1.getSurname();

        ///////// mother information
        FamilyMember mother1 = family.getMother();
        String motherName = mother1.getName();
        String motherSurname = mother1.getSurname();
        int motherAge = mother1.getAge();

        //////// second child
        FamilyMember secondChild1 = family.getChild2();
        String secondChildName = secondChild1.getName();
        int secondChildAge = secondChild1.getAge();

        System.out.println("Father");
        System.out.println( fatherName + " " + fatherSurname);

        System.out.println("Mother");
        System.out.println("name: " + motherName);
        System.out.println("age: " + motherAge);

        System.out.println("Second child");
        System.out.println("name: " + secondChildName);
        System.out.println("age: " + secondChildAge);

    }
}
