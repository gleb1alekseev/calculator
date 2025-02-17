package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SumTests {

    public Calculator calculator;

    @BeforeMethod
    public void init() {
        calculator = new Calculator();
    }

    @AfterMethod
    public void clear() {
        calculator = null;
    }

    @DataProvider(name = "sumDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {1, 2, 3},
                {0, 0, 0},
                {-5, 5, 0},
        };
    }

    @Test(dataProvider = "sumDataProvider", description = "This test sum of two numbers", priority = 1)
    public void sumTwoNumbers(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.sum(a, b), expectedResult);
    }
}
