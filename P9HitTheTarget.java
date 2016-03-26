import java.util.Scanner;

public class P9HitTheTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for (int i = 1, j = target - i; i < Math.min(target, 21); i++, j--) {
            if (j > 20) {
                continue;
            }
            System.out.printf("%d + %d = %d\n", i, j, target);
        }
        for (int i = target + 1, j = 1; i < 21; i++, j++) {
            System.out.printf("%d - %d = %d\n", i, j, target);
        }
    }
}
