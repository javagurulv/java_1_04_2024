package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_3;

class TaxV2Demo {
    public static void main(String[] args) {

        TaxV2 taxes = new TaxV2();

        System.out.println("Tax from 9000 will be: " + taxes.taxCalc(9000));
        System.out.println("Tax from 11000 will be: " + taxes.taxCalc(11000));
        System.out.println("Tax from 48000 will be: " + taxes.taxCalc(48000));
        System.out.println("Tax from 55000 will be: " + taxes.taxCalc(55000));
        System.out.println(taxes.taxCalc(-100));

    }

}
