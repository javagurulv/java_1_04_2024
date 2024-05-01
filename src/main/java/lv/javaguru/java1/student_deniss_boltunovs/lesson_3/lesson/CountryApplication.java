package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

class CountryApplication {

    public static void main(String[] args) {

        Country country1 = new Country("Italy", "ITL", 14563);
        Country country2 = new Country("Great Britain", "GB", 250);

        System.out.println("Country 1 : " + country1.getCountry());
        System.out.println("Country 1 code : " + country1.getCode());
        System.out.println("Country 1 population : " + country1.getPopulation());

        System.out.println("Country 2 : " + country2.getCountry());
        System.out.println("Country 2 code : " + country2.getCode());
        System.out.println("Country 2 population : " + country2.getPopulation());

    }
}
