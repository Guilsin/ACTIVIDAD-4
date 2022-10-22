package Punto2;

public class localOficina extends inmuebleLocal {
    
    //atributos:
    protected static double valorArea = 3500000;
    protected boolean esGobierno;
    
    //método constructor de oficina:
    public localOficina(int identificador, int area, String direccion , tipo tipoLocal, boolean esGobierno){
        super(identificador, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }
    
    void imprimir(){
        super.imprmir();
        System.out.println("Es oficina gubernamental? = " + esGobierno);
        System.out.println();
    }
}
