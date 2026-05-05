class Main {
    public static void main(String[] args) {
        String original = "naman";
        StringBuilder sb = new StringBuilder(original);
        
        // Reverse the content
        String reversed = sb.reverse().toString();

        // Use .equals() on two String objects
        if (original.equals(reversed)) {
            System.out.println("its a palindrome");
        } else {
            System.out.println("its not a palindrome");
        }
    }
}
