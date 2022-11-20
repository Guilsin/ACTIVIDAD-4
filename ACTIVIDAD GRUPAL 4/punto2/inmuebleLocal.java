package punto2;

public class inmuebleLocal extends inmueble {

    //atributos:
    enum tipo{INTERNO,CALLE};
    protected tipo tipoLocal;
    
    //constructor inmueble local:
    public inmuebleLocal(int identidicador, int area, String direccion, tipo tipoLocal){
        super(identidicador, area, direccion);
        this.tipoLocal = tipoLocal;
    }
    
    void imprmir(){
        super.imprimir();
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
