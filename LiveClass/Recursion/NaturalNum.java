public class NaturalNum{
    public static void Gen_number(int n)
    {
        if (n>5)
            return;

        System.out.println(n);
        Gen_number(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        Gen_number(n);
    }
}