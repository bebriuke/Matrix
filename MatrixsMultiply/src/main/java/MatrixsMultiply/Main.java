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
        int size = 5;
        try{
            size = sc.nextInt(); 
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        sc.close();
        
        
        long startTime = System.currentTimeMillis();
        Matrix firstMultiplier  = new Matrix(size);
        firstMultiplier.setMatrix();
        Matrix secondMultiplier  = new Matrix(size);
        secondMultiplier.setMatrix();
        firstMultiplier.printMatrix();
        System.out.println("");
        firstMultiplier.printMatrix();
        System.out.println("");
        Multiply.matrixs(firstMultiplier, secondMultiplier);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");    


    }
    
}