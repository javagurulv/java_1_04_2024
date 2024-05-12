package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_3;

class TaxDemo {
    public static void main(String[] args) {

        Tax taxNumber = new Tax();

        System.out.println(taxNumber.taxes(5000));
        System.out.println(taxNumber.taxes(30000));
        System.out.println(taxNumber.taxes(60000));
        System.out.println(taxNumber.taxes(-100));
    }
}
