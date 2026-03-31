import java.util.Scanner;
public class FactOfNum {
    public static int fact(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return fact(n-1) * n;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);
        sc.close();
    }
}
