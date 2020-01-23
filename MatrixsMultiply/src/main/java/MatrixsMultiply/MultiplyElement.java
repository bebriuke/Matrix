package MatrixsMultiply;

public class MultiplyElement extends Thread {
    private Thread t;
    private Matrix A;
    private Matrix B;
    private Matrix ABProduct;
    private int i;
    private int j;
    
    
    MultiplyElement(Matrix A, Matrix B, Matrix ABProduct, int i, int j){  // skaièiuojamas sandaugos matricos i-osios eilutës j-asis elemetas
        this.A = A;
        this.B = B;
        this.ABProduct = ABProduct;
        
        this.i = i;
        this.j = j;
        t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run() {
        try {
            int n = A.getSize();
            int [] A = this.A.getRow(i);
            int [] B = this.B.getCol(j);
            for(int x=0; x<n; x++){
                ABProduct.setIJElement(i, j, ABProduct.getIJElement(i, j)+ A[x]*B[x]);
            }
        }catch (Exception e) {
             System.out.println(e);
        }
    }
}