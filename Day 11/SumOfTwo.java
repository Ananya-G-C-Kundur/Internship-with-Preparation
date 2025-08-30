//Funtions part

//Write a function for Adding two numbers 

public class SumOfTwo {
    
    static int get_Sum(int number1, int number2){   //declare
        int sum = number1 + number2;                //Implimentation  => Defination
        return sum;
    }
    
    public static void main(String[] args){
        int result = get_Sum(10, 15);   //Invocation or Calling the function
        System.out.println("The Sum of two numbers is : "+result);
    }
}
