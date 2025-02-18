package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTests extends BaseTests{

    @DataProvider(name = "multiplyDataProvider")
    public Object[][] multiplyDataProvider() {
        return new Object[][]{
                {4, 5, 20},
                {6, 0, 0},
                {2.4, 2, 4.8}
        };
    }

    @Test(dataProvider = "multiplyDataProvider", description = "This test multiply of two numbers", priority = 3)
    public void multiplyTwoNumbers(double a, double b, double expectedResult) {
        Assert.assertEquals(calculator.multiply(a, b), expectedResult);
    }
}
