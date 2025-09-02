//Is the given Number is Positive Negative or Zero 

public class Positive{
    public static void main(String[] args){
        
        int Number = 0;

        //Checks if the number is Positive
        if (Number > 0){
            System.out.println("Number is Positive");
        }

        //Checks if the number is Negative
        else if (Number < 0){
            System.out.println("Number is Negative");
        }

        //Comes here if the above condition gets false
        else{
            System.out.println("Number is Zero");
        }
    }
}