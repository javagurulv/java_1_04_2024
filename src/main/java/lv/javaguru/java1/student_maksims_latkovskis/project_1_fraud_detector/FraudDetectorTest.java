package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudDetectorTest {

    public static void main(String[] args){
        FraudDetectorTest test = new FraudDetectorTest();

        test.test1();
        test.test2();
        test.test3();

    }

    void test1(){
        // case John (valid)
        Trader john = new Trader("John", "Sidney");
        Transaction transaction = new Transaction(john, 4 );
        FraudDetector fraudDetector = new FraudDetector();
        boolean isValid = fraudDetector.isFraud(transaction);

        if(isValid) System.out.println("Test 1 Pass");
        else System.out.println("Test 1 Fail");
    }

    void test2(){
        // case Pokemon (invalid)
       Trader pokemon = new Trader("Pokemon", "London");
       Transaction transaction = new Transaction(pokemon, 4 );
        FraudDetector fraudDetector = new FraudDetector();
        boolean isValid = fraudDetector.isFraud(transaction);

        if(isValid) System.out.println("Test 1 Fail");
        else System.out.println("Test 1 Pass");
    }

    void test3(){
        // case pokemon (valid)
        Trader pokemonLowercase = new Trader("pokemon", "London");
        Transaction transaction = new Transaction(pokemonLowercase, 4 );
        FraudDetector fraudDetector = new FraudDetector();
        boolean isValid = fraudDetector.isFraud(transaction);

        if(isValid) System.out.println("Test 1 Pass");
        else System.out.println("Test 1 Fail");
    }




}
