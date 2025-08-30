public class Functions {
    public static void main(String[] args) {
        System.out.println("Namasthe");

        printArguments(args);
    }

    public static void printArguments(String[] args) {
        System.out.println("number of arguments :" +args.length);

        for(int i=0;i<args.length;i++){
            System.out.println("args[" + i + "]" +args[i]);
        }
    }
}
