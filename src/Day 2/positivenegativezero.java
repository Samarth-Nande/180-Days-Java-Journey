import java.util.Scanner;

public class positivenegativezero {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=obj.nextInt();
        if(number>0){
            System.out.println("The number is positive");
        }
        else if(number==0){
            System.out.println("The number is zero");
        }
        else if(number<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
