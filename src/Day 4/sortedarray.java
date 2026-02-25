import java.util.Scanner;

public class sortedarray {
    public static void main(String[] args) {
        System.out.println("Enter size : ");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        boolean issorted = true;
        System.out.println("The elements of array are:");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
            if (arr[i] > arr[i + 1]) {
                issorted = false;
                break;
            }
        }
        if (issorted=true) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
