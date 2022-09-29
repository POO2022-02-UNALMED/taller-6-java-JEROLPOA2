package vehiculos;

import java.util.ArrayList;

public class Pais {

    private String nombre;
    private static ArrayList<Pais> paises = new ArrayList<Pais>();
    public ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public Pais(String nombre){

        this.nombre = nombre;
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais paisMayorVentas(){

        Pais p = null;
        int b = 0;

        for(int i = 0; i < Pais.paises.size(); i++){

            int a = Pais.paises.get(i).vehiculos.size();

            if(a>b){
                p = Pais.paises.get(i);
                b = a;
            }
            
        }

        return p;
    }
}
