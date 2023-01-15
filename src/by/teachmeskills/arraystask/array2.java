package by.teachmeskills.arraystask;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array number: ");
        int N = in.nextInt();

        int[] tmp = new int[mass.length];
        int j = 0;
        for (int k : mass) {
            if (N == k) continue;
            tmp[j++] = k;
        }
        if (j > 0) {
            int[] newMas = new int[j];
            System.arraycopy(tmp, 0, newMas, 0, j);
            System.out.println(Arrays.toString(newMas));
        } else {
            System.out.println("Not found");
        }
    }
}
