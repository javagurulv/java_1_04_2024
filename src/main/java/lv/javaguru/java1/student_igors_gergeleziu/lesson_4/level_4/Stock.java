package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_4;

class Stock {
    String company;
    int actualPrice;
    int minPrice;
    int maxPrice;

    public Stock(String company, int actualPrice) {
        this.company = company;
        this.actualPrice = actualPrice;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;
    }

    void updatePrice(int newPrice) {
        this.actualPrice = newPrice;
        if (newPrice > maxPrice) this.maxPrice = newPrice;
        if (newPrice < minPrice) this.minPrice = newPrice;
    }

    public String getCompany() {
        return company;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
