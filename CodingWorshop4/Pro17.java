//Function to print intersection or common elements of two integer arrays getCommonElements

public class Pro17 {

    public static void getCommonElements(int[] arr1, int[] arr2){
        for(int i = 0 ; i<arr1.length; i++){
            boolean isFound = false;
            for(int j = 0 ; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    isFound = true;
                    break;
                }
            }
            if(isFound){
                System.out.print(arr1[i] +" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,5,2,6,7,9};
        int[] arr2 = {2,6,4,3,5,8};

        getCommonElements(arr1, arr2);
    }
}
