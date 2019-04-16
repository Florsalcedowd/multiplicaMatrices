/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicamatrices;

import javax.swing.JOptionPane;

/**
 *
 * @author flocy
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matriz m1= new Matriz(dim("Ingrese el n° de filas Matriz 1"),dim("Ingrese el n° de columnas Matriz 1"));
        Matriz m2= new Matriz(dim("Ingrese el n° de filas Matriz 2"),dim("Ingrese el n° de columnas Matriz 2"));
        
        System.out.println("Matriz 1");
        m1.llenarMostrarMatriz();
        System.out.println("----------------------");
        System.out.println("Matriz 2");
        m2.llenarMostrarMatriz();
        System.out.println("----------------------");
        
        if(m1.dim2 != m2.dim1){
            System.out.println("¡¡No se puede multiplicar!!\nEl número de columnas de la primera matriz debe coincidir con el número de filas de la segunda matriz");
        } else {
            System.out.println("¡¡La multiplicación es posible!!\nEl resultado es: ");
            Matriz m3= new Matriz(m1.dim1,m2.dim2);
            multiplica(m1.m, m2.m, m3.m);
        }

    }
    
    public static int dim(String a){
        int b=Integer.parseInt(JOptionPane.showInputDialog(a));;
        return b;
    }
    
    public static void multiplica(int m1[][], int m2[][], int m3[][]){
         for (int i = 0; i < m1.length; i++) {
             for (int j = 0; j < m2[0].length; j++) {
                 for (int k = 0; k < m1[0].length; k++) {
                     m3[i][j]+= m1[i][k] * m2[k][j];
                 }
                 if (j == m3[0].length - 1) {
                    System.out.println(m3[i][j]);
                } else {
                    System.out.print(m3[i][j] + "\t"); 
                }
             }
        }
    }
  
}
