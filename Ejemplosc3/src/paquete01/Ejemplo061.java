
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        String cadenafinal="";
        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}};
        /*
        10      41      40
        1       2       3
        */
        int suma = 0;
        int valor;
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {
                valor = arreglo1[fila][col];
                if (fila==col){
                    suma = suma + valor;
                    cadenafinal=String.format(" %s\n%s\t\n "
                            ,cadenafinal, arreglo1[fila][col]);
                }
                
            }
            
        }System.out.printf("La suma de: %s\nEs igual: %d\n",cadenafinal,suma);
        //System.out.println("es igual a : "+suma);
        
    }
    
}
