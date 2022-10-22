package Punto2;

public class casaRural extends viviendaCasa {
    
    //atributos:
    protected static double valorArea = 1500000;
    protected int distanciaCabecera, altitud;
    
    //método constructor casa rural:
    public casaRural(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabecera, int altitud){
        super(identificador, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal = " + distanciaCabecera + "km");
        System.out.println("Altitud sobre el nivel del mar = " + altitud);
        System.out.println();
    }
}
