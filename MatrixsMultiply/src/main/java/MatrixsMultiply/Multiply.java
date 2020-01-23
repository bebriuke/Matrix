package MatrixsMultiply;

public class Multiply { 
    
    static void matrixs(Matrix firstMultiplier, Matrix secondMultiplier){
        int size = firstMultiplier.getSize();
        Matrix productValueByUsingFunction = new Matrix(size);
        Matrix productValueByUsingThreads = new Matrix(size);
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                //skaièiuoju sandaugos matricos i-osios eilutës j-àjá elemetà 
                MultiplyElement t = new MultiplyElement(firstMultiplier, 
                                        secondMultiplier, 
                                        productValueByUsingThreads, i, j); //(2)bandau naudoti thread'us
                /*              
                productValueByUsingFunction.setIJElement(i, j, 
                                                productIJElement(firstMultiplier.getRow(i), 
                                                                 secondMultiplier.getCol(j)));
            */}
        }
        //productValueByUsingFunction.printMatrix(); //(1)
        //System.out.println();
        productValueByUsingThreads.printMatrix(); //(2)
        
    }
    
    
   
    static int productIJElement(int[] A, int[] B){
        int n = A.length; //A.length = B.lebgth:  2 square matrices of the same size 
        int rez = 0;
        for(int x=0; x<n; x++){
                rez = rez + A[x]*B[x];
        }
        return rez;
    }   
}