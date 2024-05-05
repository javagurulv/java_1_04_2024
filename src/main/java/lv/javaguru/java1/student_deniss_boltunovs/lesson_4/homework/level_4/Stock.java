package lv.javaguru.java1.student_deniss_boltunovs.lesson_4.homework.level_4;

class Stock {

    private String company;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }


    public String getCompany() {
        return this.company;
    }

    public int getCurrentPrice() {
        return this.currentPrice;
    }

    public int getMinPrice() {
        return this.minPrice;
    }

    public int getMaxPrice() {
        return this.maxPrice;
    }

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        // update Min price
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
        // update Max price
        if (newPrice > this.maxPrice) {
           this.maxPrice = newPrice;
        }
    }

}
