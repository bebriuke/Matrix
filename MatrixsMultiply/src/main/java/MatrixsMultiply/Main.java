/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixsMultiply;

import java.util.Scanner;

/**
 *
 * @author gvala
 */
public class Main {

   public static void main(String[] args) {
        
       
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrices you want to multiply:  ");
        int n = 300;
        try{
            n = sc.nextInt(); 
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        sc.close();
        
        
        long startTime = System.currentTimeMillis();
        Matrica A  = new Matrica(n);
        Matrica B  = new Matrica(n);
        A.printMatrica();
        System.out.println("");
        B.printMatrica();
        System.out.println("");
        Multiply.Matrics(A, B);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");    


    }
    
}
