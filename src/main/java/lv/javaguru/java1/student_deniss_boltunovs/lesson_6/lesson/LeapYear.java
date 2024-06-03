package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.lesson;

class LeapYear {
    public boolean isLeapYear(int year) {
        /*
        Правило деления на 4:
            Год является високосным, если он делится на 4 без остатка.
            Например, годы 2012, 2016 и 2020 являются високосными,
            так как они делятся на 4 без остатка.

        Исключение в правиле деления на 100:
            Если год делится на 100 без остатка,
            то для его определения как високосного года
            необходимо выполнение дополнительного условия.
            Это означает, что годы, которые делятся на 100,
            могут быть високосными только в том случае,
            если они также делятся на 400 без остатка.
            Например, годы 1600 и 2000 являются високосными,
            так как они делятся на 100 и на 400 без остатка.

        Правило деления на 400:
            Если год делится на 400 без остатка,
            то он всегда является високосным.
            Например, 2000 год является високосным,
            так как он делится на 400 без остатка.
        */

        if (isDividedBy100(year) && isDividedBy400(year)) {
            return true;
        } else if (!isDividedBy100(year) && isDividedBy4(year)) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isDividedBy4(int year) {
        return year % 4 == 0;
    }

    private boolean isDividedBy100(int year) {
        return year % 100 == 0;
    }

    private boolean isDividedBy400(int year) {
        return year % 400 == 0;
    }

}
