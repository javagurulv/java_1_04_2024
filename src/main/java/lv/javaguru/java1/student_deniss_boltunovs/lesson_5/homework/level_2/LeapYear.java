package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_2;

class LeapYear {

    public void isLeapYear(int number) {
        boolean isDividedBy4 = number % 4 == 0;
        boolean isDividedBy100 = number % 100 == 0;
        boolean isDividedBy400 = number % 400 == 0;

        if (isDividedBy100 && isDividedBy400) {
            System.out.println("Leap Year: " + number);
        } else if (!isDividedBy100 && isDividedBy4) {
            System.out.println("Leap Year: " + number);
        } else{
            System.out.println("Common Year: " + number);
        }

    }

}