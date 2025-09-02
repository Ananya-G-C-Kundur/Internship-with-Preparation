//This code Print's the tables from 2 to 10

package Day15;

public class PrintingTable {
    public static void main(String[] args) {

        //outer for loop runs 2 to 10
        for(int number = 2; number <= 10 ; number++){
            //Inner for loop  runs 10 * 10
            for(int value = 1; value <= 10; value++){
                System.out.print(number * value +" ");
            }
            System.out.println();
        }
    }
}
