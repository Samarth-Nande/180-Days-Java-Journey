import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        int i=0;
        int largest = arr[i];
        System.out.println("Elements of array are: ");
        for (i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
            for (int j = 1; j < size; j++) {
                if (arr[i] < arr[j]) {
                    largest = arr[j];
                }
            }
        }
        System.out.println("largest is " + largest);
    }
}
