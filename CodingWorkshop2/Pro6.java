// package CodingWorkshop2;

import java.util.Scanner;

public class Pro6 {

    //printing single character's ASCII value
    
    public static int ASCII(char ch){
        int conversion = ch;   //When convert character into Integer it will give you ASCII value

        return conversion;
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter teh Charcter : ");
        char ch = obj.next().charAt(0);

        System.out.println("The ASCII value of the character : " +ASCII(ch));

        obj.close();
    }
}
