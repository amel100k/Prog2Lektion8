package opgave02;

public class Opgave02 {

    private double[][] doubleArray;
    public Opgave02(double[][] doubleArray){
        this.doubleArray = doubleArray;
    }

    public static void main(String[] args) {
        double[][] numbers = {
                {1, 2, 3, 4.0},
                {5, 6.5, 7, 8},
                {9, 10, 11, 12},
                {13,14,15,16}
        };
        System.out.println("averageMajorDiagonal(numbers) = " + averageMajorDiagonal(numbers));
    }
    public static double averageMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum / m.length;
    }
}
