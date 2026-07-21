class Calculator{
    static int powerInt(int n1, int n2){
        return (int) Math.pow(n1, n2);
    }
    static double powerDouble(double n1, int n2){
        return Math.pow(n1, n2);
    }
}
public class CalculatorClass{
    public static void main(String[] args){
        int res1 = Calculator.powerInt(2,5);
        double res2 = Calculator.powerDouble(2.5, 3);
        System.out.println("PowerInt: "+res1);
        System.out.println("PowerDouble: "+res2);
    }
}