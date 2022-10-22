package punto2;

public class apartamentoFamiliar extends viviendaApartamento {
    
    //atributos:
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    
    //contructor apartamento familiar:
    public apartamentoFamiliar(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBaños, int valorAdministracion){
        super(identificador, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración =" + valorAdministracion + "$");
        System.out.println();
    }
}
