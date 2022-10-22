package punto4;

public class Velocista extends Ciclista{
	private double potencialPromedio;
	private double velocidadPromedio;
	
	public Velocista(int identificador,String nombre, double potenciaPromedio,double velocidadPromedio) {
		super(identificador,nombre);
		potenciaPromedio= potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}
	
	protected double getPotencialPromedio() {
		return potencialPromedio;
	}
	
	protected void setPotenciaPromedio(double potenciaPromedio) {
		this.potencialPromedio=potenciaPromedio;
	}
	
	protected double getvelocidadPromedio() {
		return velocidadPromedio;
	}
	
	protected void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio=velocidadPromedio;
	}
	
	protected void imprimir() {
		super.imprimir();
		System.out.println("Potencia promedio="+potencialPromedio);
		System.out.println("Velocidad promedio="+velocidadPromedio);
	}
	
	protected String imprimirTipo() {
		return "Es un velocista";
		
	}

}
