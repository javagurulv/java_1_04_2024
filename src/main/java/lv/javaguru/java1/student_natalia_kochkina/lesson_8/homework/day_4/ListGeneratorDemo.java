package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_4;

class ListGeneratorDemo {

    public static void main(String[] args) {
        ListGenerator generator = new ListGenerator();

        System.out.println(generator
                .generateMillionElementsList(2, 1000000)
                .size());
//        System.out.println(generator
//                .generateMillionElementsList(2, 1000000000)
//                .size());
    }

    //создать список с миллионом объектов получилось,
    //а с миллиардом - нет

}
