package punto2;

public class inmueble { 
    
    //atributos
   protected int identificador, area ;
   protected String direccion;
   protected double precioVenta;
    
    //método constructor:
    inmueble(int identificador, int area, String direccion){
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
    }
    
    //metodo calculador de precio de venta:
    double calcularPrecioVenta(double valorArea){
        precioVenta = area*valorArea;
        return precioVenta;
    }
    
    //metodo muestra en pantalla los datos del inmueble
    void imprimir(){
    System.out.println("Identificador inmobiliario = " + identificador);
    System.out.println("Área = " + area);
    System.out.println("Dirección = " + direccion);
    System.out.println("Precio de venta = $" + precioVenta);
    }
}
