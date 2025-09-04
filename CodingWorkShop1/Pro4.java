package CodingWorkShop1;

public class Pro4 {

    //Function isDigit to return if it is a digit
    public static boolean isDigit(String s){

        for(int index = 0; index <= s.length()-1; index++){
            if (s.charAt(index) < '0' || s.charAt(index) > '9'){
                return false;    //finds a non digit -> stop and return false
            }
        }
        return true; //all characters were didgits
    }

    public static void main(String[] args) {
        System.out.println(isDigit("1234"));  //true
        System.out.println(isDigit("1a23"));  //false
    }
}
