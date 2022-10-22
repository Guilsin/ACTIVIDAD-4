package Punto2;

public class casaIndependiente extends casaUrbana{
    //atributos:
    protected static double valorArea = 3000000;
    
    public casaIndependiente(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos){
        super(identificador, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println();
    }
}
