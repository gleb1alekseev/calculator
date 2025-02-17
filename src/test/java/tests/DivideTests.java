package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivideTests {
    public Calculator calculator;

    @BeforeMethod
    public void init(){
        calculator = new Calculator();
    }

    public void clear(){
        calculator = null;
    }

    @DataProvider(name = "divideDataProvider")
    public Object[][] divideDataProvider() {
        return new Object[][]{
                {20, 5, 4},
                {0, 6, 0}
        };
    }

    @Test(dataProvider = "divideDataProvider", description = "This test divide of two numbers", priority = 4)
    public void divideTwoNumbers(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.divide(a, b), expectedResult);
    }
}
