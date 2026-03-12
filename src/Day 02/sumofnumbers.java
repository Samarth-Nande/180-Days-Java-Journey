import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=obj.nextInt();
        int sum=n*(n+1)/2;
        System.out.println("Sum is "+sum);
    }
}
