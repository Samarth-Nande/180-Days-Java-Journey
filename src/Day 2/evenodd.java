import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=obj.nextInt();
        if(number%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd");
        }
    }
}
