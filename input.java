import java.math.BigDecimal;
import java.util.Scanner;


/**
 * Created by Administrator on 2017/4/2.
 */
public class input {
    public static void main(String[] args){

        BigDecimal num1, num2, answer;
        String st1, cont;

        cont = "yes";

        while (cont.equals("yes"))
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入簡易計算式,並以空白鍵分開,ex: 2 + 3,但只會運算加減乘除喔,噗哧 XD");

            //num1 = scanner.nextInt() ;
            num1 = scanner.nextBigDecimal();
            st1 = scanner.next();
            num2 = scanner.nextBigDecimal() ;

            System.out.println("您輸入的算式為：" + num1+st1+num2 );

            answer= test.Func(num1,num2,st1) ;
            System.out.println("答案是："+answer) ;

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("是否要繼續使用計算機? yes or no");
            cont = scanner1.next();

        }
    }
}
