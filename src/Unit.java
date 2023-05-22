import java.util.Scanner;

public class Unit {
    public static void getUnit(int num){
        if(num<=10){
            System.out.println("Unit is one");
        } else if (num>10 && num<=100) {
            System.out.println(" Unit is Ten");

        } else if (num>100 && num<=1000) {
            System.out.println(" Unit is hundred");

        } else {
            System.out.println(" Invalid input");

        }
    }
    public static void main(String[] args) {
        System.out.println("Enter no to check unit");
        Scanner scanner=new Scanner(System.in);
        int no = scanner.nextInt();
        getUnit(no);


    }
}
