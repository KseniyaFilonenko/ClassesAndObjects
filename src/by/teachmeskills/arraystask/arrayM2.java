package by.teachmeskills.arraystask;

public class arrayM2 {
    public static void main(String[] args) {
        int[][] array = new int[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                if ((i + j) % 2 == 0) {
                    System.out.println("W");
                } else {
                    System.out.print("B");
                }
        }
    }
}
