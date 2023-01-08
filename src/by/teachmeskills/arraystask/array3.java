package by.teachmeskills.arraystask;

import java.util.Arrays;
import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int N = in.nextInt();
        if (N <= 0) {
            System.out.println("Invalid array size");
            return;
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, avg = 0;
        int[] mass = new int[N];
        for (int i = 0; i < N; i++) {
            mass[i] = (int)(10 * Math.random()); //случайные числа от 0 до 9
            if (min > mass[i]) min = mass[i];
            if (max < mass[i]) max = mass[i];
            avg += mass[i];
        }
        avg /= N;
        System.out.println(Arrays.toString(mass));
        System.out.println("Min: " + min + ", max: " + max + ", avg: " + avg);
    }
}
