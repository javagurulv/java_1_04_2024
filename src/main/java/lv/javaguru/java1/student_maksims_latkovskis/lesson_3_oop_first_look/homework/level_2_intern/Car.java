package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_2_intern;

class Car {

    private String make;
    private String colour;
    private double price;

    public Car(String make, String colour, double price){

        this.make = make;
        this.colour = colour;
        this.price = price;

    }

    public String getMake(){
        return this.make;
    }

    public String getColour(){
        return this.colour;
    }

    public double getPrice(){
        return this.price;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setPrice(double price){
        this.price = price;
    }

}
