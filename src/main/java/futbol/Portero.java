package futbol;

public class Portero extends Futbolista {

    public short golesRecibidos;
    public byte dorsal;

    public boolean juagarConLasManos(){
        return true;
    }

    public Portero(String nombre, int edad, short  golesRecibidos, byte dorsal){

        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public int compareTo(Futbolista f){

        if (f instanceof Portero) {
            return Math.abs(this.golesRecibidos - ((Portero)f).golesRecibidos);
        }
        return 0;
    }


    public String toString(){

        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;

    }
}
