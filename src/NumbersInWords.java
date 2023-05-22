import java.util.Scanner;
//1. Read a single Digit Number and write in word
public class NumbersInWords {
    public static void getWord(int num){

        if(num==1){
            System.out.println("One");
        } else if(num==2){
            System.out.println("Two");

        } else if(num==3){
            System.out.println("Three");

        } else if(num==4){
            System.out.println("Four");

        } else if(num==5){
            System.out.println("Five");

        } else if(num==6){
            System.out.println("Six");

        } else if(num==7){
            System.out.println("Seven");

        } else if(num==8){
            System.out.println("Eight");

        } else if(num==9){
            System.out.println("Nine");

        } else {
            System.out.println("Invalid input");

        }
    }
    public static void main(String[] args) {

        System.out.println("Enter single digit number to convert it into word");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        getWord(x);

    }
}
