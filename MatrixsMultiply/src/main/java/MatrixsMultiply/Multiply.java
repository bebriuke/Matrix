/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixsMultiply;

/**
 *
 * @author gvala
 */
public class Multiply {
    
    static void Matrics(Matrica A, Matrica B){
        int n = A.length();
        int[][] C = new int [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //MultiplyElement t = new MultiplyElement(A.row(i), B.col(j), n, "");
                C[i][j] = IJElementOf(A.row(i), B.col(j));
            }
        }
        print(C);       
        
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
