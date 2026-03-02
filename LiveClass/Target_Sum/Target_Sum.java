package Target_Sum;

public class Target_Sum {
    public static void get_Target_Sum(int[] array, int targetSum)
    {
        int difference= 0;
        for (int i=0; i<=array.length-1; i++)
        {
            difference = targetSum - array[i];
            for (int j=i+1; j<=array.length-1; j++)
            {
                if (difference == array[j])
                {
                    System.out.println("The two numbers are : "+ array[i] +" "+ array[j]);
                    return;
                }
            }
        }
        System.out.println("No numbers found which add up to targetSum");
    }
    public static void main(String[] args) {
        int[] array = {7,10,-9,3,5};
        int targetSum = 13;

        get_Target_Sum(array, targetSum);
    }
}
