public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        int reversedNumber = 0;

        for (int temp = n; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        if(n==reversedNumber){
            System.out.println("No is Palindrome");
        } else{
            System.out.println("not palindrome");
        }


    }
}



