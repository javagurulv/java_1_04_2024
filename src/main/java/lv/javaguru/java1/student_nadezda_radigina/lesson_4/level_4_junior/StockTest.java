package lv.javaguru.java1.student_nadezda_radigina.lesson_4.level_4_junior;


class StockTest {
     public static void main(String[] args){
         StockTest stockTest = new StockTest();
         stockTest.test1();
         stockTest.test2();


     }
    public void test1(){
       Stock stock = new Stock("Cat", 15);
       String expectedName = "Cat";
       int expectedPrice = 15;


        if ((expectedName.equals(stock.getName()) && (expectedPrice == stock.getCurrentPrice()))){
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");

        }


    }
    public void test2(){
        Stock stock = new Stock("Cat", 14);
        int expectedMinPrice = 7;
        int expectedMaxPrice = 15;
        stock.updatePrice(18);
        stock.updatePrice(10);

        if ((expectedMinPrice == stock.getMinPrice() && (expectedMaxPrice == stock.getMaxPrice()))){
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");

        }
     }

}
