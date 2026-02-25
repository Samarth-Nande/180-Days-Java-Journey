import java.util.Scanner;

public class countnegativenum {
    public static void main(String[] args){
        System.out.println("Enter size: ");
        Scanner obj=new Scanner(System.in);
        int size= obj.nextInt();
        int count= 0;
        int[] arr=new int[size];
        System.out.println("Elements of array are: ");
        for(int i=0;i<size;i++){
            arr[i]= obj.nextInt();
            if(arr[i]<0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("Count of negative numbers:"+count);
    }
}
