
package ejerciciosbasicosprogramacion;
import java.util.Scanner;
/**
 *
 * @author moech
 */
public class EjerciciosBasicosProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //pedir un numero n y mostrar todos los numeros de 1 a n
         
         Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n = reader.nextInt(), i = 0;
       
        while (i <= n){
            i++;
            System.out.println(" El numero es: "  + i);
        }
    
    }
        
    }   
        

