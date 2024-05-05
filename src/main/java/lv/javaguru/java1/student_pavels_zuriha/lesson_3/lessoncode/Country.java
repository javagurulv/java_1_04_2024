package lv.javaguru.java1.student_pavels_zuriha.lesson_3.lessoncode;

class Country {

    private String name;
    private String code;
    private int population;

    public Country(String name, String code, int population) {

        this.name = name;
        this.code = code;
        this.population = population;

    }

}

class CountryApp {

    public static void main(String[] args) {

        Country latvia = new Country("Latvia", "LV", 1000000);
        Country estonia = new Country("Estonia", "EE", 20000000);

    }
}
