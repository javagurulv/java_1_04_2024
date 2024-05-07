package lv.javaguru.java1.student_pavels_zuriha.lesson_4.homework.level_4;

class Stock {

    private String companyTitle;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyTitle, int currentPrice) {
        this.companyTitle = companyTitle;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public String getCompanyTitle() {
        return this.companyTitle;
    }

    public int getCurrentPrice() {
        return this.currentPrice;
    }

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (this.minPrice > newPrice) {
            this.minPrice = newPrice;
        }
        else if (this.maxPrice < newPrice) {
            this.maxPrice = newPrice;
        }

    }

    public int getMinPrice() {
        return this.minPrice;
    }

    public int getMaxPrice() {
        return this.maxPrice;
    }


}

class StockApp {
    public static void main(String[] args) {
        Stock google = new Stock("GOOGLE", 10);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        google.updatePrice(10);

        System.out.println("Company = " + google.getCompanyTitle());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

    }

}