public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;          // Get last digit
            reversed = reversed * 10 + digit; // Append to reversed
            num /= 10;                     // Remove last digit
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
