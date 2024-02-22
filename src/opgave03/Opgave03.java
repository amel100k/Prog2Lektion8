package opgave03;

import java.util.Arrays;

public class Opgave03 {
    public static void main(String[] args) {
        double[][] numbers = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };
        System.out.println("locateSmallest(numbers) = " + Arrays.toString(locateSmallest(numbers)));
    }
    public static int[] locateSmallest(double[][] a) {
        double small = a[0][0];
        int[] smallest = new int[2];
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                if (small > a[row][column]) {
                    small = a[row][column];
                    smallest[0] = row;
                    smallest[1] = column;
                }
            }
        }
        return smallest;
    }
}
