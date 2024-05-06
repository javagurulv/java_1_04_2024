package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

class Country {

     private String country;
     private String code;
     private int population;

     public Country(String country, String code, int population) {
         this.country = country;
         this.code = code;
         this.population = population;
     }

     public String getCountry() {
         return this.country;
     }

     public String getCode() {
         return this.code;
     }

     public int getPopulation() {
         return this.population;
     }

}
