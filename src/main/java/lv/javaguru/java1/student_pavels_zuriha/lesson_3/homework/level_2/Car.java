package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_2;

class Car {

    private String carBrand;
    private String carColor;
    private int carPrice;

    public Car(String carBrand, String carColor, int carPrice) {
        this.carBrand = carBrand;
        this.carColor = carColor;
        this.carPrice = carPrice;

    }

    public String getCarBrand() {
        return this.carBrand;

    }

    public String getCarColor() {
        return this.carColor;

    }

    public int getCarPrice() {
        return  this.carPrice;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

}
