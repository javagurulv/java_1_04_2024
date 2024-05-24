package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_7;

import java.math.BigDecimal;

class TemperatureConverterTest {

    public static void main(String[] args) {
        TemperatureConverterTest test = new TemperatureConverterTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    //32 -> 89.6
    public void test1() {
        TemperatureConverter converter = new TemperatureConverter();
        BigDecimal realResult = converter.calculateFahrenheit(new BigDecimal("32"));
        checkResult(realResult, new BigDecimal("89.6"),
                "Celsius to Fahrenheit test1 ");
    }

    //-10 -> 14
    public void test2() {
        TemperatureConverter converter = new TemperatureConverter();
        BigDecimal realResult = converter.calculateFahrenheit(new BigDecimal("-10"));
        checkResult(realResult, new BigDecimal("14"),
                "Celsius to Fahrenheit test2 ");
    }

    //33 -> 0.56
    public void test3() {
        TemperatureConverter converter = new TemperatureConverter();
        BigDecimal realResult = converter.calculateCelsius(new BigDecimal("33"));
        checkResult(realResult, new BigDecimal("0.56"),
                "Fahrenheit to Celsius test1 ");
    }

    //186 -> 85.56
    public void test4() {
        TemperatureConverter converter = new TemperatureConverter();
        BigDecimal realResult = converter.calculateCelsius(new BigDecimal("186"));
        checkResult(realResult, new BigDecimal("85.56"),
                "Fahrenheit to Celsius test2 ");
    }

    private void checkResult(BigDecimal realResult,
                             BigDecimal expectedResult,
                             String testScenarioName) {
        if ((realResult.compareTo(expectedResult)) == 0) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }
}
