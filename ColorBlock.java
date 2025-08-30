//Find if there is a green color block

public class ColorBlock {
    public static void main(String[] args) {
        String array[] ={"blue","yellow","purple","red","green","light blue"};

        for(int i=0;i<array.length-1;i++){ //i is iterating variable
            if(array[i] == "green"){
                System.out.println("Green block found");
            }
        }
    }
}
