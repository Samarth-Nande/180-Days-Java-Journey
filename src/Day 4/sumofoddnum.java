import java.util.Scanner;

public class sumofoddnum {
    public static void main(String[] args) {
        System.out.println("Enter size: ");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        System.out.println("Elements of array are: ");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum is " + sum);
    }
}