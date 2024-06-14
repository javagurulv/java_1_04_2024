package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.homework.level_3_junior;

class DaySalesDataTest {

    public static void main(String[] args){
        DaySalesDataTest test = new DaySalesDataTest();
        test.test1();
        test.test2();

    }

    void test1(){
        DaySalesData data = new DaySalesData();
        Receipt [] receipts = new Receipt[10];
        for(int i =0; i<10; i++){

            receipts[i] = new Receipt(i+1, 10*(i+1));
        }
        System.out.println(data.dayAverageReceipt(receipts));
        if(data.dayAverageReceipt(receipts) == 50.0) System.out.println("Test 1 Pass");
        else System.out.println("Test 1 Fail");
    }

    void test2(){
        DaySalesData data = new DaySalesData();
        Receipt [] receipts = new Receipt[10];
        for(int i =0; i<10; i++){
            receipts[i] = new Receipt(i, 50);
        }

        if(data.dayTotalIncome(receipts) == 500) System.out.println("Test 2 Pass");
        else System.out.println("Test 2 Fail");
    }



}
