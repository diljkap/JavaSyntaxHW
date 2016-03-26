import java.util.Scanner;

public class P6ConvertBase7ToBase10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sevenBase = sc.next();
        Integer tenBase = Integer.valueOf(sevenBase,7);
        System.out.println(tenBase);
    }
}
