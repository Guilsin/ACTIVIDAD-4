package Punto2;

public class viviendaApartamento extends inmuebleVivienda {
    
    //método constructor de apartamento:
    public viviendaApartamento(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBaños){
        super( identificador, area, direccion, numeroHabitaciones, numeroBaños);
    }
    
    void imprimir(){
        super.imprimir();
    }
}
