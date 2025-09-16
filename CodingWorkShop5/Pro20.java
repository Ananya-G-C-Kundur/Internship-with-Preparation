package CodingWorkShop5;

//Function to remove spaces from the string removeSpaces

public class Pro20 {
    static String removeSpaces(String input){

        StringBuilder result = new StringBuilder();

        for(int index = 0; index < input.length(); index++){
            char oneChar = input.charAt(index);

            if(oneChar == ' '){
                continue;
            }
            else{
                result = result.append(oneChar);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "How are you";

        System.out.println(removeSpaces(input));
    }
}
