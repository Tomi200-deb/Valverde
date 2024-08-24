

package ejemplo.github;

import java.util.ArrayList;
import java.util.Scanner;


public class Github {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList();   
        
        for (String nombre : nombres) {
            nombre = leer.next();
            nombres.add(leer.next());
        }
        
        for(String nombre : nombres) {
            System.out.println("nombre: "+nombre);
            
        }
}
}