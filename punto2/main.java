package Punto2;

public class main {

    public static void main(String[] args) {
        apartamentoFamiliar apto1 = new apartamentoFamiliar(103067,120,"Avenida Las palmas 69-420",3,2,2000000);
        System.out.println("Datos del inmueble:");
        apto1.calcularPrecioVenta(apto1.valorArea);
        apto1.imprimir();
        
        apartamentoApartaestudio aptestudio1 = new apartamentoApartaestudio(12354,50,"Avenida Caracas 30-15",1,2);
        System.out.println("Datos del inmueble:");
        aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
        aptestudio1.imprimir();
    }
}
