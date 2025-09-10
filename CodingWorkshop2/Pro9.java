//Function to reverse the String reverseString

import java.util.Scanner;

public class Pro9 {
    
    public static void reverseString(String Str){

        for(int i = Str.length()-1; i>=0 ; i--){
            System.out.print(Str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String Str = obj.nextLine();

        System.out.print("The reverse of the String : ");
        reverseString(Str);

        obj.close();
    }
}
