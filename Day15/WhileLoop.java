package Day15;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;

        while( count <= 10){
            System.out.print(count +" ");
            count = count + 1;
        }System.out.println();

        do{
            System.out.print(count +" ");
            count = count - 1;
        }while(count >= 0);
    }
}
