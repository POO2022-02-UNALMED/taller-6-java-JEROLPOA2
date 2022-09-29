package vehiculos;

public class Vehiculo {
    
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;
    protected static int cantidadVehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMaxima,  String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos += 1;

        this.fabricante.vehiculos.add(this);
        this.fabricante.getPais().vehiculos.add(this);
    }

    public String vehiculosPorTipo(){
        
        return "Automoviles: " + Automovil.getAutomoviles() + "\n" + "Camionetas: " + Camioneta.getCamionetas() + "\n" + "Camiones: " + Camion.getCamiones();
    }

    public String getPlaca(){
        return placa;
    }
    public int getPuertas(){
        return puertas;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getPeso(){
        return peso;
    }
    public String getTraccion(){
        return traccion;
    }
    public Fabricante getFabricante(){
        return fabricante;
    }
    public static int getCantidadVehiculos(){
        return cantidadVehiculos;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

}
