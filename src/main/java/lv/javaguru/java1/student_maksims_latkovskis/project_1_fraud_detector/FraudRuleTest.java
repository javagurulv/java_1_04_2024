package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRuleTest {

    public static void main(String[] args){
        FraudRuleTest test = new FraudRuleTest();

        test.testRule1();
        test.testRule2();
        test.testRule3();
        test.testRule4();
        test.testRule5();
    }

    void testRule1(){
        Trader trader = new Trader("Pokemon", "Mexico", "Mexico");
        Transaction transaction = new Transaction(trader, 4);

        FraudRule1 fraudRule1 = new FraudRule1();
        if(fraudRule1.isFraud(transaction).isFraud()){
            System.out.print("Test 1 Pass");
            System.out.println(" " + fraudRule1.isFraud(transaction).getRuleName());
        }
        else System.out.println("Test 1 Fail");
    }

    void testRule2(){
        Trader trader = new Trader("Jonny", "Mexico", "Mexico");
        Transaction transaction = new Transaction(trader, 9999999);

        FraudRule2 fraudRule2 = new FraudRule2();
        if(fraudRule2.isFraud(transaction).isFraud()) {
            System.out.print("Test 2 Pass");
            System.out.println(" " + fraudRule2.isFraud(transaction).getRuleName());
        }
        else System.out.println("Test 2 Fail");
    }

    void testRule3(){
        Trader trader = new Trader("Jonny", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 4);

        FraudRule3 fraudRule3 = new FraudRule3();
        if(fraudRule3.isFraud(transaction).isFraud()){
            System.out.print("Test 3 Pass");
            System.out.println(" " + fraudRule3.isFraud(transaction).getRuleName());
        }
        else System.out.println("Test 3 Fail");
    }

    void testRule4(){
        Trader trader = new Trader("Jonny", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 4);

        FraudRule4 fraudRule4 = new FraudRule4();
        if(fraudRule4.isFraud(transaction).isFraud()){
            System.out.print("Test 4 Pass");
            System.out.println(" " + fraudRule4.isFraud(transaction).getRuleName());
        }
        else System.out.println("Test 4 Fail");
    }

    void testRule5(){
        Trader trader = new Trader("Jonny", "Dusseldorf", "Germany");
        Transaction transaction = new Transaction(trader, 2000);

        FraudRule5 fraudRule5 = new FraudRule5();
        if(fraudRule5.isFraud(transaction).isFraud()){
            System.out.print("Test 5 Pass");
            System.out.println(" " + fraudRule5.isFraud(transaction).getRuleName());
        }
        else System.out.println("Test 5 Fail");
    }



}
