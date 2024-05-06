package lv.javaguru.java1.student_natalia_kochkina.lesson_4.homework.level_4;

class Stock {
    private String companyName;
    private int price;
    private int maxPrice;
    private int minPrice;

    public Stock(String companyName, int price) {
        this.companyName = companyName;
        this.price = price;
        this.minPrice = price;
        this.maxPrice = price;
    }

    public void updatePrice(int price) {
        if (price > maxPrice) {
            maxPrice = price;
        } else if (price < minPrice) {
            minPrice = price;
        }
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }
}
