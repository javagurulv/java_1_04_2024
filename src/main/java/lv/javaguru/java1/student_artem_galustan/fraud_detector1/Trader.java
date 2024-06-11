package lv.javaguru.java1.student_artem_galustan.fraud_detector1;

class Trader {

    private String fullName;
    private String city;


    private Trader(String fullName,String city){
      this.city = city;
      this.fullName = fullName;

    }
    String getFullName(){
        return this.fullName;
    }
    String getCity(){
        return  this.city;
    }
}

