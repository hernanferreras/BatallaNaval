
package batallanaval;

import java.util.HashSet;

public class BatallaNaval {

    public static void main(String[] args) {
       
        Barcos Lancha = new Barcos(); 
        Lancha.recibirdisparo();
        Lancha.largo=1;
        Lancha.setNombre("maria");
        System.out.println(Lancha.getNombre());
        
        Jugador Persona = new Jugador();
        Persona.setPuntaje(1500);
        Persona.consultarpuntaje();
        
    }
    
}
