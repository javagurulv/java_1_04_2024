package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_3;

class TaxV2 {

    double taxCalc(int a) {
        if ((a < 10000) && (a > 0)) {
            return a * 0.3;
        } else if ((a >= 10000) && (a <= 50000)) {
            return a * 0.4;
        } else if (a > 50000) {
            return a * 0.5;
        } else {
            return a;
        }

    }
}


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
