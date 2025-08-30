//count the even numbers in the array or list

public class EvenCount {
    public static void main(String[] args) {
        int array[] = {1,34,23,4,53};
        int count = 0;

        for(int i=0;i<array.length-1;i++){
            if(array[i]%2==0){
                count++;
            }
        }
        System.out.println("The count of even number :" +count);
    }
}
