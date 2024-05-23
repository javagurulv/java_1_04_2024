package lv.javaguru.java1.student_svetlana_bodnarska.lesson_4.homework.level_4_junior;

class Stock {
    private String name;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }
    public void updatePrice (int newPrice) {
        this.currentPrice = newPrice;
        if (this.minPrice > newPrice) {
            this.minPrice = newPrice;
        }
        if (this.maxPrice < newPrice) {
            this.maxPrice = newPrice;
        }
    }

    public String getName() {
        return name;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
