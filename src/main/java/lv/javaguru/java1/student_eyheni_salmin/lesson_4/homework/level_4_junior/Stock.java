package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_4_junior;

class Stock {
    private String name;
    private int price;
    private int minPrice;
    private int maxPrice;

    public Stock() { // дэфолтный конструктор

    }

    public Stock(String name, int price) {
        this.name = name;
        this.price = price;
        this.minPrice = price;
        this.maxPrice = price;
    }
    public Stock(String name, int price, int minPrice, int maxPrice) {
        this.name = name;
        this.price = price;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void updatePrice(int newPrice) {
        setPrice(newPrice);
        if (this.maxPrice < price) setMaxPrice(newPrice);
        if (this.minPrice > price) setMinPrice(newPrice);


    }
    public void printFullInfo() {
        System.out.println("Company = " + getName());
        System.out.println("Current Price = " + getPrice());
        System.out.println("Min Price = " + getMinPrice());
        System.out.println("Max Price = " + getMaxPrice());
    }
}
