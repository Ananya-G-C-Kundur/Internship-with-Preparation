public class Insertion_Sort
{
    public static void InsertionSort(int[] array)
    {
        int temp;
        for (int i=1; i<array.length; i++)
        {
            temp = array[i];
            for (int j=i-1; j>=0; j--)
            {
                if (array[j] > temp)
                {
                    array[j+1] = array[j];
                    array[j] = temp;
                }
                else
                {
                    break;
                }
            }
        }

        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {8,3,5,2,9};

        InsertionSort(array);
    }
}