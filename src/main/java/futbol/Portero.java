package futbol;

public class Portero extends Futbolista {

    public short golesRecibidos;
    public byte dorsal;

    public boolean juagarConLasManos(){
        return true;
    }

    public Portero(String nombre, int edad, short  golesRecibidos, byte dorsal){

        super(nombre, edad, "Portero")
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public String toString(){

        return super.toString()+" con el dorsal "+ dorsal + ". Le han marcado "+ golesRecibidos+" goles.";

    }


    public int comparar(Futbolista f){

        if (f instanceof Portero) {
            return Math.abs(this.golesRecibidos - ((Portero)f).golesRecibidos);
        }
        return 0;
    }
    
}
