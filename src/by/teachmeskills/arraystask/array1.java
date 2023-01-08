package by.teachmeskills.arraystask;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array number: ");
        int N = in.nextInt();

        boolean exists = false;
        for (int j : mass) {
            if (N == j) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.print("You entered array number");
        } else {
            System.out.println("You entered NOT array number");
        }
    }
}
