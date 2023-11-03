public abstract class Persona {
    //zona de getters / setters
    public String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //genero el constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    //genero los métodos
    public String dameNombre() {
        return nombre;
    }
    public abstract String dameDescripcion();
}
