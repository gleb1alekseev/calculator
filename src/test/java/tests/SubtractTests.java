package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractTests {
    public Calculator calculator;

    @BeforeMethod
    public void init() {
        calculator = new Calculator();
    }

    @AfterMethod
    public void clear() {
        calculator = null;
    }

    @DataProvider(name = "subtractDataProvider")
    public Object[][] subtractDataProvider() {
        return new Object[][]{
                {3, 2, 1},
                {0, 0, 0},
                {5, -5, 10},
        };
    }

    @Test(dataProvider = "subtractDataProvider", description = "This test subtract of two numbers", priority = 2)
    public void subtractTwoNumbers(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.subtract(a, b), expectedResult);
    }
}

