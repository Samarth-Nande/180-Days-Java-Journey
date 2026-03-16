public class copy_arr_elements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        
        // Copying elements from arr1 to arr2
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        
        // Printing the copied array
        System.out.print("Copied Array: ");
        for(int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
