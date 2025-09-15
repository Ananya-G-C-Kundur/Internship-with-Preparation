//Function to print unique elements in an integer array printUniqueElements

package CodingWorkShop4;

public class Pro16 {

    public static void printUniqueElements(int[] arr){
        for(int readIndex = 0; readIndex<arr.length; readIndex++){
            int compareIndex;
            for(compareIndex = 0; compareIndex < readIndex; compareIndex++){
                if(arr[readIndex] == arr[compareIndex]){
                    break;
                }
            }

            if(readIndex == compareIndex){
                System.out.print(arr[readIndex] +" ");
            }
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,4,1};

        printUniqueElements(arr);
    }
}
