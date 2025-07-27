import java.math.*;

public class CalculateFactorial {

    //n! = n × (n-1) × (n-2)
    public static long calculate(long n) {
        if(n == 0) return 1L;

        return n * calculate(n-1);
    }

    public static BigInteger calculateBig(BigInteger n) {
        if(n.equals(BigInteger.ZERO)) return BigInteger.ONE;

        return n.multiply(calculateBig(n.subtract(BigInteger.ONE)));
    }


    public static void main(String[] args) {
        System.out.println(CalculateFactorial.calculate(5));
        System.out.println(CalculateFactorial.calculate(0));
        System.out.println(CalculateFactorial.calculate(13));
    }
}