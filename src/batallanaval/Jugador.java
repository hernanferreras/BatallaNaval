
package batallanaval;
public class Jugador {
    // atributos
    public String nombre;
    public String apellido;
    private int puntaje;
    // metodo constructor
    public Jugador(){
        
    }
        // metodos
        public void realizardisparo(){
        
    }
        public void consultarpuntaje(){
            System.out.println("El jugador tiene: "+this.puntaje+" puntos");
            
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
}
