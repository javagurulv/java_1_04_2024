package lv.javaguru.java1.student_natalia_kochkina.lesson_7.lessoncode;

class IntArrayExample {

    public static void main(String[] args) {

        int[] marks = new int[5];

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        marks[0] = 1;
        marks[1] = 10;
        marks[2] = 9;
        marks[3] = 7;
        marks[4] = 5;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        marks[2] = marks[1] + marks[3];
        marks[2] = marks[1] + marks[4];

        System.out.println("Length = " + marks.length);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
            System.out.print(" ");
        }

        int[] arr = {1, 2, 3, 4};

        System.out.println("Arr = " + arr[0]);
        System.out.println("Arr = " + arr[1]);
        System.out.println("Arr = " + arr[2]);
        System.out.println("Arr = " + arr[3]);

    }

}
