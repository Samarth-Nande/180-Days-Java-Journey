import java.util.Scanner;

public class evennumfromarray {
    public static void main(String[] args){
        System.out.println("Enter size : ");
        Scanner obj=new Scanner(System.in);
        int size= obj.nextInt();
        int[] arr=new int[size];
        System.out.println("The elements of array are:");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
