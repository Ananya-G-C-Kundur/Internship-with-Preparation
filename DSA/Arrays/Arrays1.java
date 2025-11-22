public class Arrays1{

    public static void printElements(int[] elements)
    {
        for( int index=0; index < elements.length; index++)
        {
            // Generate the sequential array index from 0 to length-1
            System.out.print(elements[index] +" ");
        }
        System.out.println();
    }

    public static void printElements2(int[] elements)
    {
        // for each loop
        for( int element : elements)
        {
            System.out.print(element +" ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix)
    {
        // rows
        for( int row=0; row<2; row++)
        {
            // columns
            for( int col=0; col<3; col++)
            {
                // Printing rows and columns
                System.out.print(matrix[row][col] +" ");
            }
            System.out.println();
        }
    }

    // Sort an array without using in-bulit function
    // Using bubble sort algorithm
    public static void sortAnArray(int[] elements)
    {
        for( int index=0; index < elements.length-1; index++)
        {
            for( int j=0; j < elements.length-1; j++)
            {
                if( elements[j] > elements[j+1])
                {
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        // Declare , initialize
        int[] numbers = {1,2,3};   // 12 bytes assigned 

        System.out.println("Number of elements in the array = " +numbers.length);

        System.out.println("The numbers array : ");
        printElements(numbers);

        int[] ages = new int[3];
        ages[0] = 20;
        ages[1] = 32;
        ages[2] = 21;

        System.out.println("The ages array : ");
        printElements2(ages);

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
        };

        // Values in the matrix
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[0][2]);

        // homework 
        System.out.println("Values in the matrix : ");
        printMatrix(matrix);

        System.out.println("Sort the values of ages array using in-built function : ");
        java.util.Arrays.sort(ages);
        printElements(ages);

        System.out.println("Sort the values of ages array not using in-bulit function : ");
        sortAnArray(ages);
        for (int element : ages)
        {
            System.out.print(element +" ");
        }
    }
}