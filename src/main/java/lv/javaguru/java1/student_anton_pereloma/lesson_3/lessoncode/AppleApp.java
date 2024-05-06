package lv.javaguru.java1.student_anton_pereloma.lesson_3.lessoncode;

public class AppleApp {
    public static void main(String[] args) {

        Apple appleType1 = new Apple("macintosh", "red", 100);
        Apple appleType2 = new Apple("pink lady", "red", 70);
        Apple appleType3 = new Apple("golden delicious", "yellow", 90);

        System.out.println("Apple type: " + appleType1.getType());
        System.out.println("Apple color: " + appleType1.getColor());
        System.out.println("Apple weight: " + appleType1.getWeight());

    }
}
