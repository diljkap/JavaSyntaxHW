import java.util.Scanner;

public class P11GetFirstOddOrEven {
    public static void main(String[] args) {
        Scanner scNumbers = new Scanner(System.in);
        String input = scNumbers.nextLine();
        String[] stringNumbers = input.split(" ");
        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        Scanner scCommand = new Scanner(System.in);
        String Command = scCommand.next();
        int numCount = scCommand.nextInt();
        int counter = 0;
        String numType = scCommand.next();

        switch (numType) {
            case "even":

                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 == 0 && counter <= numCount) {
                        System.out.printf("%d ", numbers[i]);
                        counter++;
                    }
                }
                break;
            case "odd":

                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % 2 != 0 && counter <= numCount) {
                        System.out.printf("%d ", numbers[i]);
                        counter++;
                    }
                }
                break;
        }
    }
}




