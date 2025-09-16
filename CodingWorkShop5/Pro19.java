package CodingWorkShop5;

//Function to print binary values of various input like integer ,cahr , also perform shift operations on 

public class Pro19 {
    public static void printBinary(int number){   //Signed Int , positive and negative numbers
        if(number < 0)
            return;
        
        int countOfBits = Integer.BYTES * 8;

        //EX : Integer is 4 bytes, 4*8 = 32 bits , left most bit is the sign
        // 31 bits for the value

        int mask = 1;
        mask = mask << (countOfBits - 2);

        System.out.println("Binary form of number " + number + " ");

        while (mask > 0){
            int result = number & mask;

            if(result != 0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
            mask = mask >> 1;

        }
    }

    public static void main(String[] args) {
        int number = 2;

        printBinary(number);
    }
}
