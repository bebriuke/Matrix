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
public class MultiplyElement implements Runnable {
    Thread t;
    int[]A;
    int[]B;
    int n;
    int rez = 0;
    String name;
    
    MultiplyElement(int[]A, int[]B, int n, String name){
        this.A = new int[A.length];
        this.B = new int[B.length];
        this.name = name;
        this.A = A.clone();
        this.B = B.clone();
        this.n = n;
        t = new Thread(this);
        //System.out.println("New thread: " + t);
        t.start();
    }
    
//    Multiply(Matrica A, Matrica B){
//        t = new Thread();
//        System.out.println("New thread: " + t);
//        t.start();
//    }
    @Override
    public void run() {
        try {
            for(int x=0; x<n; x++){
                rez = rez + A[x]*B[x];
            }
            System.out.println(rez + " ");
        }catch (Exception e) {
             System.out.println(e);
        }
        //System.out.println(name + " exiting.");

    }
    
}
