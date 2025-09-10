//Function to getStrLength to get string length
import java.util.Scanner;

public class Pro7 {
    public static int getStrLength(String Str){
        int count = 0;
        int n = Str.length();
        for(int index = 0; index < n; index++){
            if (Str.charAt(index) != (n-1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the string :");
        String Str = obj.nextLine();

        System.out.println("The length of the given string: " +getStrLength(Str));

        obj.close();

    }
}
