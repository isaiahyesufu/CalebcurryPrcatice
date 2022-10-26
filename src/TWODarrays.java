public class TWODarrays {
    public static void main(String[]args){
        int [][] Array2D= {
                {2,3,4},
                {4,6,8},
                {8,18,32}
        };
       // System.out.println(Array2D[1][1]);
        for ( int row=0;row<Array2D.length;row++){
            for ( int col=0;col<Array2D[row].length;col++){
                System.out.print(Array2D[row][col]+ " ");

            }
            System.out.println("");

        }
    }
}
