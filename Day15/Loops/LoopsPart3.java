public class LoopsPart3 {
    public static void PrintStarGridConcatApproach(int gridSize)
    {
        for(int count=1; count <= gridSize; count++)
        {
            StringBuilder line = new StringBuilder();
            for( int row=1; row <= gridSize; row++)
            {
                line.append("*");
            }
            System.out.println(line.toString());
        }
    }

    public static void PrintStarForSkipEven(int gridSize)
    {
        for(int count=1; count <= gridSize; count++)
        {
            StringBuilder line  = new StringBuilder();
            for(int row=1; row <= gridSize; row++)
            {
                // How to check if row value is even
                /*if(row % 2 == 0)
                {
                    line.append(" ");
                }
                else
                {
                    line.append("*" +" ");
                }*/

                line.append(row % 2 == 0 ? " " : "*");
            }System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        // PrintStarGridConcatApproach(5);
        PrintStarForSkipEven(5);
    }
}
