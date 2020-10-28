class transpose
{
    public static void main(String args[])
    {
        int row=2;
        int column=3;
        int i,j;
        int [][]matrix={ {2,3,4}, {4,5,7} };
        int [][]transpose= new int [column][row];
        for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        for(i=0;i<column;i++)
        {
         for(j=0;j<row;j++)
         {
             System.out.print(transpose[i][j]+" ");
         }
         System.out.println();
         
        }
    }
}

