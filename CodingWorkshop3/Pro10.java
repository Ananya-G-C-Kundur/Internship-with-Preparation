//Function to get Sum of all elements in the integer array getSum

public class Pro10 {
    public static int getSum(int[] array){
        int sum = 0;

        for(int i = 0; i<array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println("Sum of array of Integer :" +getSum(array));
    }
}
