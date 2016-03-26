import java.util.Scanner;

public class P3FormattingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String aBinary;
        aBinary = String.format("%10s",(Integer.toString(a,2))).replace(" ","0");
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.printf("%1$-10X|%2$10s|%3$10.2f|%4$-10.3f|", a, aBinary, b, c);
    }
}
