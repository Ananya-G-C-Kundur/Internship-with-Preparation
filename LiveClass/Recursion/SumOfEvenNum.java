import java.util.Scanner;

public class SumOfEvenNum {
    public static int sum(int n)
    {
        if (n<=0)
        {
            return 0;
        }
        if (n%2 == 0)
        {
            return sum(n-1)+n;
        }
        else
        {
            return sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println(result);
        sc.close();
    }
}
