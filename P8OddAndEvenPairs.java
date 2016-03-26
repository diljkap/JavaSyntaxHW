import java.util.Scanner;

public class P8OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        String[] line = numbers.split(" ");
        int[] input = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            input[i] = Integer.parseInt(line[i]);
        }

        if (line.length % 2 == 0) {
            for (int i = 0; i < line.length; i += 2) {

                if ((input[i] % 2) == 0 && (input[i + 1] % 2) == 0) {
                    System.out.println(input[i] + "," + input[i + 1] + " -> both are even");
                } else if ((input[i] % 2) != 0 && (input[i + 1] % 2) != 0) {
                    System.out.println(input[i] + "," + input[i + 1] + " -> both are odd");
                } else {
                    System.out.println(input[i] + "," + input[i + 1] + " -> different");
                }
            }
        } else {
            System.out.println("Invalid length");
        }
    }
}
