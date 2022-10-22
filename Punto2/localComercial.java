package punto2;

public class localComercial extends inmuebleLocal {
    
    //atributos:
    protected double valorArea = 3000000;
    protected String centroComercial;
    
    //método constructor del local comercial:
    public localComercial(int identidicador, int area, String direccion, tipo tipoLocal, double valorArea, String centroComercial){
        super(identidicador, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
