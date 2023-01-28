package by.teachmeskills.arraystask;

import java.util.Arrays;

public class array4 {
    public static void main(String[] args) {
        int avg1 = 0, avg2 = 0;
        int[] mass1 = new int[] {1, 2, 3, 4, 5};
        int[] mass2 = new int[] {1, 2, 3, 4, 5};
        for (int k : mass1) {
            avg1 += k;
        }
        for (int j : mass2) {
            avg2 += j;
        }
        avg1 = avg1 / mass1.length;
        avg2 = avg2 / mass2.length;
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        System.out.println("Avg for the first array: " + avg1);
        System.out.println("Avg for the second array: " + avg2);
        if (avg1 == avg2) {
            System.out.println("Equals");
        } else if (avg1 > avg2) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
