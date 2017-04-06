import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/27.
 */

public class test{
    public static void main(String[] args) {
        System.out.println("Hello Worldsss");
    }
    public static BigDecimal Func(BigDecimal num1, BigDecimal num2, String st1) {

        //BigDecimal newnum1 = new BigDecimal(num1);
        //BigDecimal newnum2 = new BigDecimal(num2);

        BigDecimal answer = new BigDecimal("0");

        if (st1.equals("+")) {
            answer = num1.add(num2);
        }
        if (st1.equals("-")) {
            answer = num1.subtract(num2);
        }
        if (st1.equals("*")) {
            answer = num1.multiply(num2);
        }
        if (st1.equals("/")) {
            answer = num1.divide(num2);
        }
        return answer;
        //System.out.print(answer);
    }
}
