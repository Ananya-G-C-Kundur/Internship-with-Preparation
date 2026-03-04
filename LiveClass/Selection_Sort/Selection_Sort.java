public class Selection_Sort{
    public static void SelectionSort(int[] array)
    {
        for (int i=0; i<array.length-1;i++)
        {
            int min_val = array[i];
            int min_index = i;
            for (int j=i+1; j<array.length; j++)
            {
                if (min_val > array[j])
                {
                    min_val = array[j];
                    min_index = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {9,6,2,16,13};
        SelectionSort(array);
    }
}