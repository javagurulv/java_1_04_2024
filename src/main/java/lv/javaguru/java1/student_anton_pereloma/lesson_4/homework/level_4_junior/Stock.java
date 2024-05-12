package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_4_junior;

class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    String getCompany() {
        return companyName;
    }

    int getCurrentPrice() {
        return currentPrice;
    }

    int getMinPrice() {
        return minPrice;
    }

    int getMaxPrice() {
        return maxPrice;
    }

    void setMinMax(int currentPrice) {
            if (currentPrice > maxPrice) {
                maxPrice = currentPrice;
            } else if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
        }


    void updatePrice(int newPrice) {
        currentPrice = newPrice;
        setMinMax(currentPrice);
    }

}
