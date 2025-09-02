package Day15;

public class Loops {
    public static void main(String[] args) {

        //for( datatype START ; STOP (condition) ; CHANGE){}
        
        for (int Number = 0; Number <= 10; Number++){  //Reverse 10 to 0

            if (Number == 5){   //if number becomes 5 then it skips 5 and continue with next 
                continue;
            }

            System.out.print(Number +" ");

        }
    }
}
