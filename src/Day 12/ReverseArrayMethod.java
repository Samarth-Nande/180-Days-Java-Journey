public class ReverseArrayMethod {
    public static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.print("Reversed array: ");
        reverseArray(numbers);
    }
}