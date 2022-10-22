package Punto2;

public class casaUrbana extends viviendaCasa {
    
    //método constructor de la casa urbana:
    public casaUrbana(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos){
        
        super( identificador, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }
    
    void imprimir(){
        super.imprimir();
    }
}
