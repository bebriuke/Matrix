/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixsMultiply;

import java.util.Random;

/**
 *
 * @author gvala
 */
public class Matrica {

   private int [][] matric;
   private int n;
    
    Matrica(int n){
        this.n = n;
        matric  = new int[n][n];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matric[i][j] = r.nextInt(10)+1;
            }   
        }
    }
    
    
    
    public void printMatrica(){
        for(int i = 0; i < matric.length; i++){
            for(int j = 0; j < matric.length; j++){
                System.out.print(matric[i][j]+ "  ");
            }  
            System.out.println("");
        }
    }
    
    public int length(){
        return n;
    }
    
    public int [] row(int i){
        int[] row = new int [n];
        for(int j = 0; j < n; j++){
            row[j] = matric[i][j];
        }
        return row;
    }
    
    public int [] col(int j){
        int[] col = new int [n];
        for(int i = 0; i < n; i++){
            col[i] = matric[i][j];
        }
        return col;
    }
}
