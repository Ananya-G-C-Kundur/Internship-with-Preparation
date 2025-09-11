//Function to search in an sorted integer array 

public class Pro13 {
    public static int search(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,6,4,11,15,7};
        int key = 11;

        int index = search(arr, key);

        if(index != -1){
            System.out.println("Key found");
        }
        else{
            System.out.println("Key not found");
        }
    }
}
