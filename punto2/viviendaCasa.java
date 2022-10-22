package Punto2;

public class viviendaCasa extends inmuebleVivienda{
    
    //atributos
    protected int numeroPisos;
    
    //método constructor de casa:
    public viviendaCasa(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos){
        super( identificador, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println("Número de pisos = " + numeroPisos);
    }
}
