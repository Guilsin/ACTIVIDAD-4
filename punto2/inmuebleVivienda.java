package punto2;

public class inmuebleVivienda extends inmueble{
    //atributos
    protected int numeroHabitaciones, numeroBaños;
    
    //método constructor de vivienda:
    public inmuebleVivienda(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBaños){
        super(identificador, area, direccion); //invoca al método constructor de la clase padre
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
    
    void imprimir(){
        super.imprimir(); //invoca al método imprimir de la clase padre
        System.out.println("Número de habitaciones = " + numeroHabitaciones);
        System.out.println("Número de baños = " + numeroBaños);
    }

}
