package punto2;

public class apartamentoApartaestudio extends viviendaApartamento {
    
    protected static double valorArea = 1500000;
    
    //constructor apartaestudio:
    public apartamentoApartaestudio(int identificador, int area, String direccion, int numeroHabitaciones, int numeroBaños){
        
        //los apartaestudios solo tienen 1 baño y 1 habitación
        super(identificador, area, direccion,1,1);
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println();
    }
}
