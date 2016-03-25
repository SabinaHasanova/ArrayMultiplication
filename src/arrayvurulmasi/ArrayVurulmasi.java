/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayvurulmasi;

/**
 *
 * @author user
 */
public class ArrayVurulmasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] a = new int[2][3];
        int[][] b = new int[3][3];
        
        int[][] c=new int[2][3];
        //fill array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
               
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
               
                b[i][j] = (int) (Math.random() * 10);
            }
        }
        
        
          for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("-----------");

        
           for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("-----------");
        
        
        
        
        //////////////////////
        int x=0;
        
        
        for (int k = 0; k < c.length; k++) {
            c[k][0]=0;
            for (int i = 0; i < a[k].length; i++) {
            for (int j = 0; j < b[k].length; j++) {                                  
                 
                c[k][j]=c[k][j]
                        +a[k][i]*b[i][j];
                
            }
           //c[k][i]=x;  
           
        }
        }
        
           for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("-----------");
        
        
    }
    
}
