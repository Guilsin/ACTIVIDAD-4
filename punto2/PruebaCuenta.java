import java.util.*;
public class PruebaCuenta {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuenta de ahorros");
		System.out.println("Ingrese saldo inicial=$");
		float saldoInicialAhorros = entrada.nextFloat();
		System.out.println("Ingrese tasa de interés=");
		float tasaAhorros= entrada.nextFloat();
		CuentaAhorros cuenta = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
		System.out.println("Ingresar cantidad a consignar=$");
		float cantidadDepositar =entrada.nextFloat();
		cuenta.consignar(cantidadDepositar);
		System.out.println("Ingresar cantidad a retirar= $");
		float cantidadRetirar=entrada.nextFloat();
		cuenta.retirar(cantidadRetirar);
		cuenta.extactoMensual();
		cuenta.imprimir();
		}
}
