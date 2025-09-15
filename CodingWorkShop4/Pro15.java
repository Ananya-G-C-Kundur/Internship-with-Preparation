//Function get second largest element in an integer array getSecondLargest

package CodingWorkShop4;

public class Pro15{

    public static int getSecondLargest(int[] arr){

        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];    //7
        int secondmax = arr[0];  //5

        for(int i=1; i<arr.length; i++){ //i=3
            if(max < arr[i]){  // 7<4
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i] > secondmax){ //4>5
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