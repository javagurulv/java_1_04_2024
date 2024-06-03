package lv.javaguru.java1.student_natalia_kochkina.project_3_apple_warehouse;

import java.util.ArrayList;
import java.util.List;

class AppleWarehouseTest {

    public static void main(String[] args) {
    AppleWarehouseTest test = new AppleWarehouseTest();
    test.findGreenApplesTest();
    test.findRedApplesTest();
    test.findApplesByColorTest1();
    test.findApplesByColorTest2();
    test.findHeavyApplesTest();
    test.findApplesBySearchCriteriaTest1();
    test.findApplesBySearchCriteriaTest2();
    test.findApplesBySearchCriteriaTest3();
    test.findApplesBySearchCriteriaTest4();
    test.anonymousClassTest1();
    test.anonymousClassTest2();
    test.anonymousClassTest3();
    test.anonymousClassTest4();
    test.lambdaExpressionTest1();
    test.lambdaExpressionTest2();
    test.lambdaExpressionTest3();
    test.lambdaExpressionTest4();
    test.lambdaExpressionTest5();
    }

    public void findGreenApplesTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findGreenApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        checkResult(realResult, expectedResult, "findGreenApples");
    }

    public void findRedApplesTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findRedApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        checkResult(realResult, expectedResult, "findRedApples");
    }

    public void findApplesByColorTest1() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApplesByColor("yellow");
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("yellow", 50));
        expectedResult.add(new Apple("yellow", 170));
        checkResult(realResult, expectedResult, "findApplesByColor1");
    }

    public void findApplesByColorTest2() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApplesByColor("blue");
        List<Apple> expectedResult = new ArrayList<>();
        checkResult(realResult, expectedResult, "findApplesByColor2");
    }

    public void findHeavyApplesTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApplesHeavierThen(150);
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        checkResult(realResult, expectedResult, "findHeavyApples");
    }

    public void findApplesBySearchCriteriaTest1() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(new GreenApplesSearchCriteria());
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        checkResult(realResult, expectedResult, "findApplesBySearchCriteria1");
    }

    public void findApplesBySearchCriteriaTest2() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(new RedApplesSearchCriteria());
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        checkResult(realResult, expectedResult, "findApplesBySearchCriteria2");
    }

    public void findApplesBySearchCriteriaTest3() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(new HeavyApplesSearchCriteria());
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        checkResult(realResult, expectedResult, "findApplesBySearchCriteria3");
    }

    public void findApplesBySearchCriteriaTest4() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(new LightweightApplesSearchCriteria());
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        expectedResult.add(new Apple("yellow", 50));
        checkResult(realResult, expectedResult, "findApplesBySearchCriteria4");
    }

    public void anonymousClassTest1() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        checkResult(realResult, expectedResult, "anonymousClass1");
    }

    public void anonymousClassTest2() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        checkResult(realResult, expectedResult, "anonymousClass2");
    }

    public void anonymousClassTest3() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        checkResult(realResult, expectedResult, "anonymousClass3");
    }

    public void anonymousClassTest4() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        expectedResult.add(new Apple("yellow", 50));
        checkResult(realResult, expectedResult, "anonymousClass4");
    }

    public void lambdaExpressionTest1() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(
                (Apple apple) -> "green".equals(apple.getColor()));
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        checkResult(realResult, expectedResult, "lambdaExpression1");
    }

    public void lambdaExpressionTest2() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(
                (Apple apple) -> "red".equals(apple.getColor()));
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        checkResult(realResult, expectedResult, "lambdaExpression2");
    }

    public void lambdaExpressionTest3() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(
                (Apple apple) -> (apple.getWeight() > 150));
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        checkResult(realResult, expectedResult, "lambdaExpression3");
    }

    public void lambdaExpressionTest4() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(
                (Apple apple) -> (apple.getWeight() < 150));
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        expectedResult.add(new Apple("yellow", 50));
        checkResult(realResult, expectedResult, "lambdaExpression4");
    }

    public void lambdaExpressionTest5() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> realResult = appleWarehouse.findApples(
                (Apple apple) -> (apple.getWeight() > 150)
                        && ("green".equals(apple.getColor())));
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        checkResult(realResult, expectedResult, "lambdaExpression5");
    }

    private void checkResult(List realResult,
                             List expectedResult,
                             String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = FAIL");
        }
    }

}
