public class largestelement {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 23, 67};
        int max = arr[0];   // assume first element is largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element = " + max);
    }
}