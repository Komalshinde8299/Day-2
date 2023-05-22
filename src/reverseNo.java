public class reverseNo {
    public static void main(String[] args) {
        int n = 231;

        int reversedNumber = 0;
        while (n != 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
