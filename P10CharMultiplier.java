import java.util.Scanner;

// P10CharMultiplier is a class which does awseome things.
// And it gets better and better by every minute.
public class P10CharMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstStr = sc.next();
        String secondStr = sc.next();
        int sumMultiplied = 0;
        for (int i = 0; i < Math.min(firstStr.length(), secondStr.length()); i++) {
            sumMultiplied += (int) firstStr.charAt(i) * secondStr.charAt(i);
        }
        int sumTail = 0;
        if (firstStr.length() < secondStr.length()) {
            for (int i = firstStr.length(); i < secondStr.length(); i++) {
                sumTail += (int) secondStr.charAt(i);
            }
        } else {
            for (int i = secondStr.length(); i < firstStr.length(); i++) {
                sumTail += (int) firstStr.charAt(i);
            }
        }
        System.out.println(sumMultiplied + sumTail);
    }
}
