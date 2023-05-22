import java.util.Scanner;

public class SumNaturalNumbers {
    public static void getAdd(int num){
        int i =1, sum=0;
        while(i<=num){
            sum=sum+i;
            i++;
        }
            System.out.println(sum );

        }



    public static void main(String[] args) {
        System.out.println("Enter no to check addition of natural no");
        Scanner scanner=new Scanner(System.in);
        int no = scanner.nextInt();
        getAdd(no);

    }
}
