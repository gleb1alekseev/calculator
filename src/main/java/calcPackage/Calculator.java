package calcPackage;

public class Calculator {
    public double sum(double a, double b){
        System.out.println("sum" + a + "and" + b + "equals" + (a + b));
        return a + b;
    }

    public double subtract(double a, double b){
        System.out.println("subtraction" + a + "and" + b + "equals" + (a - b));
        return a - b;
    }

    public double multiply(double a, double b){
        System.out.println("multiplication" + a + "and" + b + "equals" + (a * b));
        return a * b;
    }

    public double divide(double a, double b){
        System.out.println("division" + a + "and" + b + "equals" + (a / b));
        if (b == 0){
            throw new ArithmeticException("division by zero");
        }
        return a / b;
    }
}
