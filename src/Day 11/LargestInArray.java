public class LargestInArray {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 45, 3, 89, 21};
        int result = findMax(numbers);
        System.out.println("Largest element: " + result);
    }
}