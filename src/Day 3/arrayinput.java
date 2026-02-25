import java.util.*;

public class arrayinput {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size :");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            System.out.println("Element "+(i+1)+":");
            arr[i]=obj.nextInt();
        }
        System.out.println("The entered array is:");
        System.out.println(Arrays.toString(arr));
    }
}
