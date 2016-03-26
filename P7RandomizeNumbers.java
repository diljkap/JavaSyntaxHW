import java.util.ArrayList;
import java.util.Collections;
//import java.util.Random;
import java.util.Scanner;

public class P7RandomizeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstBound = sc.nextInt();
        int secondBound = sc.nextInt();
        int minBound = Math.min(firstBound,secondBound);
        int maxBound = Math.max(firstBound,secondBound);
        int numbersCount = maxBound-minBound+1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=minBound; i<=maxBound; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<numbersCount; i++) {
            System.out.print(list.get(i) + " ");
        }
//        random numbers in a range:
//        Random rand = new Random();
        //first option:
        //int[] randomNumbers = rand.ints(numbersCount, minBound, maxBound).toArray();
        //for (int randomNumber : randomNumbers) {
        //    System.out.print(randomNumber + " ");
        //}
//        second option:
//        int randomNumber = minBound + rand.nextInt((maxBound - minBound) + 1);
//        for (int i = 0; i < numbersCount; i++) {
//            System.out.print(randomNumber + " ");
//            randomNumber = minBound + rand.nextInt((maxBound - minBound) + 1);
//        }

    }
}
