public class ReversebyFor {
    public static void main(String[] args) {
        int n = 231;
        int reversedNumber = 0;

        for (int temp = n; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}

