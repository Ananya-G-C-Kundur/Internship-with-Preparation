//Function get second largest element in an integer array getSecondLargest

public class Pro15{

    public static int getSecondLargest(int[] arr){

        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        int secondmax = arr[0];

        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i] > secondmax){
                secondmax = arr[i];
            }
            
        }
        return secondmax;
    }
    public static void main(String[] args) {

        int[] arr = {2,5,7,4};

        System.out.println("The second largest element in an array :" +getSecondLargest(arr));
        
    }
}