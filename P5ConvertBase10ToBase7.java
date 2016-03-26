import java.util.Scanner;

public class P5ConvertBase10ToBase7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tenBase = sc.nextInt();
        String sevenBase = Integer.toString(tenBase,7);
        System.out.println(sevenBase);
    }
}
