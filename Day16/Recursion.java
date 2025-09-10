public class Recursion {
    public static void increment_and_print(int counter){

        if (counter >= 10){  //the break or stop condition is mentioned here
            return;
        }
        counter = counter + 1;

        System.out.print(counter +" ");  //The print statement is wrritten here

        increment_and_print(counter); 

        System.out.print(counter +" ");  //The print statement is wrritten here
        
    }
    public static void main(String[] args) {
        increment_and_print(0);
    }
}
