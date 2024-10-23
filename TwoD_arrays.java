public class TwoD_arrays {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sum = 0; // Variable to store the sum
        
        // Loop through the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j]; // Add each element to the sum
            }
        }
        
        // Print the total sum
        System.out.println("The sum of all elements is: " + sum);
    }
}
