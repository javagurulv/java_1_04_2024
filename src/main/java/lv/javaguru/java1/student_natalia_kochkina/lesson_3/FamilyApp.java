package lv.javaguru.java1.student_natalia_kochkina.lesson_3;

class FamilyApp {

    //Task_14

    public static void main(String[] args) {
        FamilyMember familyMember1 = new FamilyMember("Sveta", "Ivanova", 30);
        FamilyMember familyMember2 = new FamilyMember("Ivan", "Ivanov", 30);
        FamilyMember familyMember3 = new FamilyMember("Dima", "Ivanov", 5);
        Family family1 = new Family(familyMember1, familyMember2, familyMember3);

        FamilyMember familyMember4 = new FamilyMember("Maria", "Petrova", 35);
        FamilyMember familyMember5 = new FamilyMember("Vasja", "Petrov", 30);
        FamilyMember familyMember6 = new FamilyMember("Anton", "Petrov", 10);
        Family family2 = new Family(familyMember4, familyMember5, familyMember6);
    }
}
