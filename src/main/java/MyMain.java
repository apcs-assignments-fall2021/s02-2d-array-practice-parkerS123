import java.util.ArrayList;

public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int oddcounter = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                if (mat[row][col] % 2 != 0){
                    oddcounter++;
                }
            }
        }


        return oddcounter;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int largest = mat[0][0];
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                if (largest < mat[row][col]){
                    largest = mat[row][col];
                }
            }
        }
        return largest;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {

        for (int row = 0; row < mat.length; row++){
            int holder = mat[row][0];
            for (int col = 0; col < mat[0].length; col++){

                if (col == mat[0].length - 1){
                    mat[row][mat[0].length - 1] = holder;
                }
                else{
                    mat[row][col] = mat[row][col + 1];
                }

                }


            }
        return mat;
    }

    // Creates a new array list of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        // int row_counter = 0;
        int [][] mat = new int[arraySize][arraySize];

        for (int row = 0; row < arraySize; row++){
            for (int col = 0; col < arraySize; col++){
                mat[row][col] = row + col;
            }
        }

        return mat;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double mean = 1;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++) {
                mean = mean + mat[row][col];

            }
        }
        mean = mean/(mat.length * mat[0].length);
        return mean;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        int total = mat.length * mat[0].length;

        ArrayList<Double> arr = new ArrayList<Double>();
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                arr.add(mat[row][col]);
            }
        }


            //for (int row = 0; row < mat.length; row++){
            //for (int col = 0; col < mat[0].length; col++) {
            //total--;
            if (total % 2 == 0) {
                return (arr.get(total/2) + arr.get((total -1)/2)) / 2;
            }
            else if (total % 2 == 1) {
                return arr.get((total)/2);
            }
        return -1.0;
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        int row_holder = 0;
        int col_holder = 0;
        int counter = 1;
        int counter2 = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                counter2 = counter;
                counter = 1;
                for (int i = 0; i < mat.length; i++){
                    for (int j = 0; j < mat[0].length; j++){
                        if (mat[row][col] == mat[i][j]){
                            counter++;
                            if (counter2 < counter){
                                row_holder = row;
                                col_holder = col;
                            }


                        }
                    }
                }
            }
        }
        return mat[row_holder][col_holder];
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
