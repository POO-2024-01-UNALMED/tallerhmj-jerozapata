package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {

    //Atributos privados
    private String nombre;
    private int edad;
    private final String posicion;

    // Constructor para dar valor a los atributos
    public Futbolista(String nombre, int edad, String posicion){

        this.nombre=nombre;
        this.edad=edad;
        this.posicion=posicion;
    }

    // Constructor por defecto
    public Futbolista(){
        this("Maradona", 30, "delantero");
    }

    public int compareTo(Futbolista f){

        return Integer.compare(this.edad, f.edad);
    }

    @Override
    public String toString(){

        return "El futbolista "+ nombre + " tiene "+ edad + " años, y juega de "+ posicion+".";
        
    }

    public boolean equals(Futbolista f){
        return this.nombre.equals(f.nombre) && this.edad == f.edad && this.posicion.equals(f.posicion);
    }

    public abstract boolean juagarConLasManos();

    // Setter y getters

    public String getNombre(){

        return nombre;
    }

    public void setNombre(String nombre){

        this.nombre=nombre;

    }

    public int getEdad(){

        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public String getPosicion(){
        return posicion;
    }

    

}
