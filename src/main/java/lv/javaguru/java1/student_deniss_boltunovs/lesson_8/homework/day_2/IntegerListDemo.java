package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_2;

class IntegerListDemo {

    public static void main(String[] args) {
        IntegerList list = new IntegerList();

        System.out.println("Initial list: " + list.getList());

        list.addToListEnd(11);
        list.addToListStart(45);
        list.addToListStart(37);
        list.removeByIndex(2);
        list.removeByValue(4);

        System.out.println("Modified list: " + list.getList());
        System.out.println("List size: " + list.findListSize());
        System.out.println("Is list empty?: " + list.isListEmpty());

        list.printListElements();
    }

}
