package lv.javaguru.java1.student_pavels_zuriha.lesson_5.homework.level_3;

class Tax {

    String taxes(int a) {
        if ((a < 10000) && (a > 0)) {
            return "Tax = 30%";
        } else if ((a >= 10000) && (a <= 50000)) {
            return "Tax = 40%";
        } else if (a > 50000) {
            return "Tax = 50%";
        } else {
            return "Wrong number";
        }
    }
}

class TaxDemo {
    public static void main(String[] args) {

        Tax taxNumber = new Tax();

        System.out.println(taxNumber.taxes(5000));
        System.out.println(taxNumber.taxes(30000));
        System.out.println(taxNumber.taxes(60000));
        System.out.println(taxNumber.taxes(-100));
    }
}
