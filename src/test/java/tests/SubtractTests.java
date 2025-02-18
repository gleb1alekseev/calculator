package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractTests extends BaseTests{

    @DataProvider(name = "subtractDataProvider")
    public Object[][] subtractDataProvider() {
        return new Object[][]{
                {3, 2, 1},
                {0, 0, 0},
                {5, -5, 10},
                {7.7, 4.4, 3.3}
        };
    }

    @Test(dataProvider = "subtractDataProvider", description = "This test subtract of two numbers", priority = 2)
    public void subtractTwoNumbers(double a, double b, double expectedResult) {
        Assert.assertEquals(calculator.subtract(a, b), expectedResult);
    }
}

