/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicamatrices;

/**
 *
 * @author flocy
 */
public class Matriz {
    public int dim1, dim2;
    public int[][] m;
    
    public Matriz(int a, int b){
        this.dim1=a;
        this.dim2=b;
        m= new int[dim1][dim2];
    }
    
    public void llenarMostrarMatriz(){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = (int) (Math.random() * 20);
                if (j == m[0].length - 1) {
                    System.out.println(m[i][j]);
                } else {
                    System.out.print(m[i][j] + "\t"); 
                }
            }
        }
    }
 
}
