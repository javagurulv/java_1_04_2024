package lv.javaguru.java1.student_zarina_sidlovska.lesson_1.lesson_4.homework_4.level_1.level_2.level_4;

class Stock {

    private String company;
    private int currentPrice;
    private int maxPrice;
    private int minPrice;

    public Stock(String company, int currentPrice) {
        this.company = company;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (this.minPrice > newPrice) {
            this.minPrice = newPrice;
        }

        if (this.maxPrice < newPrice) {
            this.maxPrice = newPrice;
        }
    }

    public String getCompany() {
        return company;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }
}
