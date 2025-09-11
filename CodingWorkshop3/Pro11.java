//Function to find given string is Palindrom

public class Pro11 {

    public static String isPalindrom(String name){
        String reverse = "";

        for(int i=0; i<name.length(); i++){
            reverse = name.charAt(i) + reverse;
        }
        return reverse;
    }
    public static void main(String[] args) {
        String name = "Ananya";
        boolean result = true;

        if(isPalindrom(name).equals(name)){
            result = true;
        }
        else{
            result = false;
        }

        if(result == true){
            System.out.println("String is Palindrom");
        }
        else{
            System.out.println("String is not a Palindrom");
        }
    }
}
