public class ReverseNaturalNum {
    public static void Gen_number(int n)
    {
        if (n>5)
            return;

        Gen_number(n+1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 1;
        Gen_number(n);
    }
}
