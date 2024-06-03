package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.homework.level_4_junior;

class Stock {

    private String companyName;
    private double currentValue;
    private double minValue;
    private double maxValue;

    Stock(String companyName, double currentValue){

        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minValue = currentValue;
        this.maxValue = currentValue;
    }

    void updatePrice(int newPrice){

        if(newPrice>maxValue){
            this.maxValue = newPrice;
        }
        if(newPrice<minValue){
            this.minValue = newPrice;
        }

        this.currentValue = newPrice;
    }

    public String getCompany() {
        return companyName;
    }

    public double getCurrentPrice() {
        return currentValue;
    }

    public double getMinPrice() {
        return minValue;
    }

    public double getMaxPrice() {
        return maxValue;
    }
}

class StockApp{

    public static void main(String[] args){

        Stock google = new Stock("GOOG", 10);

        System.out.println("Company = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        System.out.println("Company = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());
    }
}
