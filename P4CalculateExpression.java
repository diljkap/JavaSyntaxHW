import java.math.BigDecimal;
import java.util.Scanner;

public class P4CalculateExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double expr1 = Math.pow(((Math.pow(a,2) + Math.pow(b,2))/(Math.pow(a,2) - Math.pow(a, 2))),((a+b+c)/ Math.pow(c,0.5)));
        double expr2 = Math.pow((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3)),(a-b));
        double diff = ((a+b+c)/3) - ((expr1+expr2)/2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",expr1, expr2, diff);
    }
}
