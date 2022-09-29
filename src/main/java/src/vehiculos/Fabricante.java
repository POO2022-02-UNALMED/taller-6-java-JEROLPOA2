package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
    public ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public Fabricante(String nombre, Pais pais){
        
        this.nombre = nombre;
        this.pais = pais;
        Fabricante.fabricantes.add(this);
    }

    public String getNombre() {
        return nombre;
    }
    public Pais getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas(){

        Fabricante f = null;
        int b = 0;

        for(int i = 0; i < Fabricante.fabricantes.size(); i++){

            int a = Fabricante.fabricantes.get(i).vehiculos.size();

            if(a>b){
                f = Fabricante.fabricantes.get(i);
                b = a;
            }
            
        }

        return f;
    }
}
