package MatrixsMultiply;

import java.util.Random;

/**
 *
 * @author gvala
 */
public class Matrix {

   private int [][] matrix;
   private int n; //size of matrix
    
    Matrix(int n){
        this.n = n;
        matrix  = new int[n][n];
    }

    public void setMatrix() {
        Random r = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = r.nextInt(10)+1;
            }   
        }
    }
     
    public int getSize(){
        return this.n;
    }
    
    public int [] getRow(int i){
        int[] row = new int [this.n];
        for(int j = 0; j < this.n; j++){
            row[j] = matrix[i][j];
        }
        return row;
    }
    
    public int [] getCol(int j){
        int[] col = new int [this.n];
        for(int i = 0; i < this.n; i++){
            col[i] = matrix[i][j];
        }
        return col;
    }
    
    public int getIJElement(int i, int j){
        return matrix[i][j];
    }
    
    public int setIJElement(int i, int j, int value){
        return matrix[i][j] = value;
    }
    
    public void printMatrix(){
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.n; j++){
                System.out.print(matrix[i][j]+ "  ");
            }  
            System.out.println();
        }
    }
    
    
}