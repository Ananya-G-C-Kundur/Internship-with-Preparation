//Function to merge two arrays and return combined output in first array

public class Pro14 {

    // Merge arr2 into arr1 (just append at the end)
    public static void merge(int[] arr1, int m, int[] arr2) {
        int n = arr2.length;

        // Start filling from index m
        for (int i = 0; i < n; i++) {
            arr1[m + i] = arr2[i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 0, 0, 0};  // first 3 are valid, rest empty
        int[] arr2 = {4, 5, 6};

        merge(arr1, 3, arr2); // m=3 (valid elements in arr1)

        System.out.print("Merged Array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}

