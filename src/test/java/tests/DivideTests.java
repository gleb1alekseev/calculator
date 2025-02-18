package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivideTests extends BaseTests{

    @DataProvider(name = "divideDataProvider")
    public Object[][] divideDataProvider() {
        return new Object[][]{
                {20, 5, 4},
                {0, 6, 0},
                {4.8, 2, 2.4},
                {6, 0, 0}
        };
    }

    @Test(dataProvider = "divideDataProvider", description = "This test divides two numbers", priority = 4)
    public void divideTwoNumbers(double a, double b, double expectedResult) {
        try {
            double result = calculator.divide(a, b);
            Assert.assertEquals(result, expectedResult);
        } catch (ArithmeticException e) {
            Assert.assertEquals(b, 0);
        }
    }
}
