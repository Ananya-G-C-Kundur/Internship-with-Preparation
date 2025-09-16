package CodingWorkShop5;
//Function to get Count of words in the String getCountOfWords

public class Pro18 {
    public static int getCountOfWords(String str){
        int countOfWords = 0;

        if (str == null){
            return countOfWords;
        }

        if (str.length() == 0){
            return countOfWords;
        }

        char prevchar = str.charAt(0);

        for(int i=0; i<=str.length()-1; i++){
            char character = str.charAt(i);

            if (character == ' ' || character == '\t' || character == '\n'){
                if(prevchar != ' ' && prevchar != '\t' && character != '\n'){
                    countOfWords ++;
                }
               
            }
            prevchar = character;
            
        }
        //Increment the count for the last word
        countOfWords = countOfWords + 1;
        return countOfWords;
    }

    public static void main(String[] args) {
        // String str = "How are you";
        //String str = null;
        // String str = ""; Empty String

        //String str = 'a'; Single character

        String str = "Namasthe  Bharath";
        System.out.println("Count of Words :" +getCountOfWords(str));
    }
}
