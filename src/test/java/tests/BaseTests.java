package tests;

import calcPackage.Calculator;
import org.testng.annotations.BeforeMethod;

public class BaseTests {
    public Calculator calculator;

    @BeforeMethod
    public void init(){
        calculator = new Calculator();
    }

    public void clear(){
        calculator = null;
    }
}
