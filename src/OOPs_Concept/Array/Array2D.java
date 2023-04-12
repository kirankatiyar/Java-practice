package OOPs_Concept.Array;

public class Array2D {
    public static void main(String[] args) {
        //Declaration and creation of Array
        int[][]  matrix = new int[2][3];
        //Initialization of Array
        matrix[0][0]=11;
        matrix[0][1]=22;
        matrix[0][2]=23;
        matrix[1][0]=21;
        matrix[1][1]=12;
        matrix[1][2]=13;
        //Retrive the value of Matrix Array;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}
