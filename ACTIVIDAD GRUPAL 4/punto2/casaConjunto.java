package punto2;

public class casaConjunto extends casaUrbana {
    
    //atributos:
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina,tieneCancha;
    
    public casaConjunto(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int valorAdministracion, boolean tienePiscina, boolean tieneCancha){
        super(identificador, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCancha = tieneCancha;
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración = " + valorAdministracion + "$");
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene cancha? = " + tieneCancha );
        System.out.println();
    }
}
