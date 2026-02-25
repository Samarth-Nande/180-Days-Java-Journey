import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter num1,num2,num3: ");
        int num1= obj.nextInt();
        int num2= obj.nextInt();
        int num3= obj.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }else if (num2>num1 && num2>num3) {
            System.out.println(num2);
        }else{
            System.out.print(num3);
        }
    }
}
