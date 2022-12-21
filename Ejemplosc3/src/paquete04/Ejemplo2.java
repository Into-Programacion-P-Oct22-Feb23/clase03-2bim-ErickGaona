/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        double[][] result = new double[2][3];
        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}}; //
        /*
            1   4   3
            36  64  9
         */
        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                if (dato1[i][j] % 2 == 0) {
                    result[i][j] = dato1[i][j] * dato1[i][j];
                } else {
                    result[i][j] = dato1[i][j];

                }

            }

        }
        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                System.out.printf("%s\t",result[i][j]);
                //System.out.println(result[i][j]);
            }
             System.out.println();
        }
    }

}
