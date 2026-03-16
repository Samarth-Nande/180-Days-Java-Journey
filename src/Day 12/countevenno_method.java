public class countevenno_method {

    public static int countEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 7, 10};
        System.out.println("Even numbers: " + countEven(numbers));
    }
}