package MatrixsMultiply;

public class Multiply {
    
    static void Matrics(Matrica A, Matrica B){
        int n = A.length();
        int[][] C = new int [n][n];
        int[][] D = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                MultiplyElement t = new MultiplyElement(A.row(i), B.col(j), D, n, i, j); //(2)bandau naudoti thread'us
              //  C[i][j] = IJElementOf(A.row(i), B.col(j)); //(1)pirmas paprastas bûdas
            }
        }
       // print(C); //(1)
        System.out.println("");
        print(D); //(2)
        
    }
    
    static int IJElementOf(int[] A, int[] B){
        int n = A.length; //A.length = B.lebgth:  2 square matrices of the same size
        int rez = 0;
        for(int x=0; x<n; x++){
                rez = rez + A[x]*B[x];
        }
        return rez;
    }
    
    
    static void print(int[][]matric){
        for(int i = 0; i < matric.length; i++){
            for(int j = 0; j < matric.length; j++){
                System.out.print(matric[i][j]+ "  ");
            }  
            System.out.println("");
        }
    }

    
    
}
