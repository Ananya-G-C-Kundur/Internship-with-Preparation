public class LoopsPart2{

    // Print starts in sequential way 
    public static void PrintStars(int countOfStars)
    {
        for(int count=1; count<=countOfStars; count++)
        {
            System.out.print("*" +" ");
        }
    }

    // Print 5 * 5 matrix 
    public static void PrintStarGrid(int gridSize)
    {
        for(int row=1; row<=gridSize; row++)
        {
            for(int col=1; col<=gridSize; col++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }

    // Print right angle triangle
    public static void PrintRightTri(int Size)
    {
        for(int row=1; row<=Size; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }

    // Print right angle triangle opp (down-top)
    public static void PrintRightTriOpp(int Size)
    {
        for(int row=1; row<=Size; row++)
        {
            System.out.println(" ");
            for(int col=Size; col>=row; col--)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }

    public static void PrintStarsForArray(int[] numbers)
    {
        for(int index=0; index<numbers.length; index++)  // read elements from Array
        {
            for (int count=1; count<=numbers[index]; count++) // Prints the star
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // PrintStars(10);
        //PrintStarGrid(5);
        //PrintRightTri(4);
        // PrintRightTriOpp(4);
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        PrintStarsForArray(numbers);
    }
}