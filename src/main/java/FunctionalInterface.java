public class FunctionalInterface {

    public static void main(String[] args) {

        Maths add = Double::sum;
        Maths multiply = (x, y) -> x*y;

        double a = 5;
        double b= 8;

        System.out.println(a+" + "+b+" = "+  calculate(a,b,add));
        System.out.println(a+" * "+b+" = "+  calculate(a,b,multiply));
    }

    public static double calculate(double x, double y, Maths operation){
        return operation.operate(x, y);
    }

    interface Maths {
        double operate(double x, double y);
    }
}
