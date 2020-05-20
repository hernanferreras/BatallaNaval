    
package batallanaval;

public class BatallaNaval {

    public static void main(String[] args) {
        
        Metodos NuevoMetodo = new Metodos();
       
        Barcos Lancha = new Barcos(3, "maria", 1); 
        Lancha.recibirdisparo();
        //Lancha.largo=1;
        //Lancha.setNombre("maria");
        System.out.println(Lancha.getNombre());
        System.out.println(Lancha.toString());
        
        Submarino sub = new Submarino(10, "Tiburon", 1);
        
        Jugador Persona = new Jugador();
        Persona.setPuntaje(1500);
        Persona.consultarpuntaje();
        System.out.println(Persona.toString());
        System.out.println("Disparos realizados: ");
        Persona.realizardisparo("A2");
        Persona.realizardisparo("B4");
        Persona.realizardisparo("F5");
        Persona.consultardisparos();
        NuevoMetodo.cartelito (1500);
        NuevoMetodo.cartelito ("El barco fue hundido");
    }
    
}
