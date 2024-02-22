package opgave01.models;

import java.util.Arrays;

public class TwoDimensionalIntArray {
    private int[][] intArray;

    public TwoDimensionalIntArray(int[][] intArray) {
        this.intArray = intArray;
    }

    public void setValueAt(int row, int column, int value) {
        value = intArray[row][column];
    }

    public int getValueAt(int row, int column) {
        return intArray[row][column];
    }


    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < intArray[row].length; i++) {
            sum += intArray[row][i];
        }
        return sum;
    }

    public int sumColumn(int column) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i][column];
        }
        return sum;
    }

    public int sumAll() {
        int sum = 0;
        for (int inner = 0; inner < intArray.length; inner++) {
            for (int outer = 0; outer < intArray[inner].length; outer++) {
                sum += intArray[inner][outer];
            }
        }
        return sum;
    }

    public void print() {
        for (int inner = 0; inner < intArray.length; inner++) {
            for (int outer = 0; outer < intArray[inner].length; outer++) {
                System.out.print(intArray[inner][outer] + " ");
            }
            System.out.println();
        }

    }

    public void map(IntFunction function) {
    }


}
