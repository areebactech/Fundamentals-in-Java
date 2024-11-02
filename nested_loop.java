public class nested_loop {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for columns
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t"); // Multiply and print, separated by tabs
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
