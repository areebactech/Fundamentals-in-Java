public class RandomUpperCase {
    public static void main(String[] args) {
        // Generating a random number between 0 and 25
        int randomNum = (int) (Math.random() * 26);

        // Adding the random number to the ASCII value of 'A' (65)
        char randomUppercaseLetter = (char) ('A' + randomNum);

        // Displaying the random uppercase letter
        System.out.println("Random uppercase letter: " + randomUppercaseLetter);
    }
}
