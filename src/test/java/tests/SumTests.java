package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class SumTests extends BaseTests{

    @DataProvider(name = "sumDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {1, 2, 3},
                {0, 0, 0},
                {-5, 5, 0},
                {2.5, 4.5, 7}
        };
    }

    @Test(dataProvider = "sumDataProvider", description = "This test sum of two numbers", priority = 1)
    public void sumTwoNumbers(double a, double b, double expectedResult) {
        Assert.assertEquals(calculator.sum(a, b), expectedResult);
    }
}
