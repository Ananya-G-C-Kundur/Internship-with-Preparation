import java.util.Scanner;
public class SumOfN{
    public static int sum(int n)
    {
        if (n==0)
        {
            return 0;
        }
        else 
        {
            return sum(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }
}