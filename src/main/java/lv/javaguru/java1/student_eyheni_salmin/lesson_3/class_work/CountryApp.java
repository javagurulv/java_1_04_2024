package lv.javaguru.java1.student_eyheni_salmin.lesson_3.class_work;

public class CountryApp {

    public static void main(String[] args) {
        Country country = new Country();

        country.setName("USA");
        country.setCode("US");
        country.setPeopleQuantity(50);


        System.out.println(country.toString());
    }
}
