package punto4;

public class PruebaCiclista {
	public static void main(String args[]) {
		Equipo equipo= new Equipo("Sky","Estados Unidos");
		Velocista velocista = new Velocista(123979,"Geraint Thomas",320,25);
		Escalador escalador= new Escalador(123980,"Egan Bernal",25,10);
		Contrarrelojista contrarrelojista = new Contrarrelojista(123981,"Jonathan Castroviejo",120);
		equipo.añadirCiclista(velocista);
		equipo.añadirCiclista(escalador);
		equipo.añadirCiclista(contrarrelojista);
		velocista.setTiempoAcumulado(365);
		escalador.setTiempoAcumulado(385);
		contrarrelojista.setTiempoAcumulado(370);
		equipo.calcularTotalTiempo();
		equipo.imprimir();
		equipo.listarEquipo();
	}

}
