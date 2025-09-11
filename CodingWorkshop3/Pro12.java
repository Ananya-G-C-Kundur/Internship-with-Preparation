//Function to print max and min value from an array , printMaxMin


public class Pro12 {

    public static void printMaxMin(int[] arr){
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 0; i<arr.length-1 ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("The minimum value is : " +min);
        System.out.println("The maximum value is :" +max);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,8};

        printMaxMin(arr);
    }
}
