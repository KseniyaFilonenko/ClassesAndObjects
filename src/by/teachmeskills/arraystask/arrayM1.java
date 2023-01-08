package by.teachmeskills.arraystask;

import java.util.Scanner;

public class arrayM1 {
    public static void main(String[] args) {
        int [] [] [] array = {{{1, 2, 3}, {4, 5}}, {{6, 7, 8}, {9, 10}, {11, 12, 13}}};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = in.nextInt();

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    result = array[i][j][k] + N;
                    System.out.println("New array " + result);

                }
            }
        }
    }
}
