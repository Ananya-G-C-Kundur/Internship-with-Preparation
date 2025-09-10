// package CodingWorkshop2;

import java.util.Scanner;

public class Pro5 {
    
    //Function simpleGreetings to accept name as input 
    // and print simple greeting "Namaskara Karnataka" name 

    public static void simpleGreeting(String name){

        System.out.println("The name Entered by the User : " +name);

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name = obj.nextLine();

        System.out.println();

        simpleGreeting(name);

        obj.close();

    }
}
