package CodingWorkShop1;

public class Pro2 {

    //Function swapNumbers to swap two variable value

    public static void swapNumbers(int num1 ,int num2){
        int temporary_variable;   // It stores the temporary value

        temporary_variable = num1;        // temp = 10
        num1 = num2;                      // num1 = 20
        num2 = temporary_variable;        // num2 = 10

        System.out.println("The swap result of numbers is : " +num1 +" "+ num2);
    }

    public static void main(String[] args) {

        System.out.println("Before swaping :");
        int num1 = 10;
        System.out.println("The number 1 : "+num1);
        int num2 = 20;
        System.out.println("The number 2 : "+num2);
        System.out.println();

        System.out.println("After Swaping :");
        swapNumbers(num1 , num2);
    }
}
