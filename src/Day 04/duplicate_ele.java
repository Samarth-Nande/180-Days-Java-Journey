import java.util.Scanner;

public class duplicate_ele {
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner obj = new Scanner(System.in);
        int size = 9;
        int[] arr = {1,2,3,1,2,5,6,8,8};
        System.out.println("Elements of array are: ");
        for (int i = 0; i < size; i++) {
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
