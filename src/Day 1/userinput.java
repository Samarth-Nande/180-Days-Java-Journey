import java.util.Scanner;

public class userinput {
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=obj.nextLine();
        System.out.println("Name: "+name);
    }
}
