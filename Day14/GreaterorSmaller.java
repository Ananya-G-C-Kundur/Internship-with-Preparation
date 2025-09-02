//Greater or Smaller number using Conditional Statemnet

public class GreaterorSmaller {
    // public static String isGreaterOrSmaller(int Number1 , int Number2){

    //     if (Number1 > Number2){
    //         return "Number 1 is Greater";
    //     }
    //     else{
    //         return "Number 2 is Greater";
    //     }
    // }
    
    // public static void main(String[] args) {
        
    //     System.out.println(isGreaterOrSmaller(10, 20));
    // }


    //Using ternary Operator

    public static void main(String[] args) {

        //Using ternary Operator

        int Number1 = 10;
        int Number2 = 20;
        
        String result = (Number1 > Number2) ? "Number 1 is Greater" : "Number 2 is Greater" ;

        System.out.println(result);
        
    }
}
