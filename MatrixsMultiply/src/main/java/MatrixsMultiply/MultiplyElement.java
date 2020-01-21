package MatrixsMultiply;

public class MultiplyElement implements Runnable {
    Thread t;
    Matrica A;
    Matrica B;
    int [][] C;
    int n;
    int i;
    int j;
    
    
    MultiplyElement(Matrica A, Matrica B, int[][] C, int n, int i, int j){
        this.A = A;
        this.B = B;
        this.C = C;
        
        this.n = n;
        this.i = i;
        this.j = j;
        t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run() {
        try {
            int [] A = this.A.row(i);
            int [] B = this.B.col(j);
            for(int x=0; x<n; x++){
                C[i][j] = C[i][j] + A[x]*B[x];
            }
        }catch (Exception e) {
             System.out.println(e);
        }
    }
}