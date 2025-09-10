//Function to Count Vowels getCountOfVowels for a given String
import java.util.Scanner;


public class Pro8 {
    
    public static int getCountOfVowels(String Str){
        char[] vowels = {'A','a','e','E','i','I','o','O','u','U'};

        int count = 0;

        for(int i=0; i<Str.length(); i++){
            for(int j=0; j<vowels.length; j++){
                if(Str.charAt(i) == vowels[j]){
                    count ++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the String :");
        String Str = obj.nextLine();

        System.out.println("The count of Vowels in the given String :" +getCountOfVowels(Str));

        obj.close();
    }
}
