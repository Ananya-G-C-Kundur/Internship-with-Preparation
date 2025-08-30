//Day 12 of learning 
//Function part 2

public class Function {
    public static void main(String[] args) { //Main Function
        enuMadudilla(); //Fuction invocation
    }

    //Function definition
    public static void enuMadudilla(){
        //printMessage("Namasthe Bharath");  //This is one way of returning

        //The another way of calling the function
        String message = "Namasthe Bharath";
        printMessage(message);
    }

    //Function with Arguments
    public static String printMessage(String message){
        System.out.println(message);

        return message;
    }

    
}
