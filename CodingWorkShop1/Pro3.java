package CodingWorkShop1;

public class Pro3 {
    public static boolean isEven(int number){
        if (number%2 == 0){      //if the number divide by 2 it should give remainder as 0 THEN it is considered as even
            return true;
        }
        else{
            return false;        // else not an even number
        }
    }

    public static void main(String[] args) {
        int number = 10;

        System.out.println("The number is : " +number);

        System.out.println();

        System.out.println("Is the given number is EVEN or not : " +isEven(number));
    }
}
