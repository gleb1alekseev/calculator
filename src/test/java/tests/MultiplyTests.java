package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplyTests {
    public Calculator calculator;

    @BeforeMethod
    public void init(){
        calculator = new Calculator();
    }

    public void clear(){
        calculator = null;
    }

    @DataProvider(name = "multiplyDataProvider")
    public Object[][] multiplyDataProvider() {
        return new Object[][]{
                {4, 5, 20},
                {6, 0, 0}
        };
    }

    @Test(dataProvider = "multiplyDataProvider", description = "This test multiply of two numbers", priority = 3)
    public void multiplyTwoNumbers(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.multiply(a, b), expectedResult);
    }
}
