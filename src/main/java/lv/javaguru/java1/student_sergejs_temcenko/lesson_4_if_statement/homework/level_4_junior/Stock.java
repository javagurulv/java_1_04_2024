package lv.javaguru.java1.student_sergejs_temcenko.lesson_4_if_statement.homework.level_4_junior;

class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrise;
    private int maxPrise;

    public Stock(String companyName, int initialPrice) {
        this.companyName = companyName;
        this.currentPrice = initialPrice;
        this.minPrise = initialPrice;
        this.maxPrise = initialPrice;
    }

    public void updatePrise(int newPrise) {
        this.currentPrice = newPrise;

        if (newPrise < this.minPrise) {
            this.minPrise = newPrise;
        }

        if (newPrise > this.maxPrise) {
            this.maxPrise = newPrise;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinPrise() {
        return minPrise;
    }

    public int getMaxPrise() {
        return maxPrise;
    }
}
