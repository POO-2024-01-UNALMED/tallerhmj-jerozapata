package futbol;

public class Jugador extends Futbolista{

    public short golesMarcados;
    public byte dorsal;

    public Jugador(){

        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){

        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }


    public int compareTo(Futbolista f){

        return Math.abs(this.getEdad() - f.getEdad());
    }

    public String toString(){
        return super.toString()+ " con el dorsal"+ dorsal+ ". Ha marcado "+ golesMarcados;   
    }


    public boolean juagarConLasManos(){
        return false;
    }


}
