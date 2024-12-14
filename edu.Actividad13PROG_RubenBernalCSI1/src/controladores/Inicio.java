/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.IncidenciasDto;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 141224
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 141224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		Scanner scanner = new Scanner(System.in);
		int opcion;
		List<IncidenciasDto> lista = new ArrayList<IncidenciasDto>();
		
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		do {
			//Muestro el menu por consola
			mi.mostrarMenu();
			//recojo la opcion que desea realizar el usuario
			opcion = scanner.nextInt();
			//Accedo a la opcion seleccionada
			switch(opcion) {
			case 1:
				oi.registrarIncidencia(scanner, lista);
				break;
			case 2:
				oi.listarIncidencias(lista);
				break;
			case 3:
				oi.actualizarEstado(lista, scanner);
				break;
			case 4:
				oi.eliminarIncidencia(lista, scanner);
				break;
			case 5:oi.buscarIncidencias(lista, scanner);
				break;
			case 6:
				System.out.println("Cerrando aplicación...");
				System.out.println("Aplicacion cerrada correctamente!!!!");
				break;
			default:
				System.err.println("Opcion no valida...");
				System.err.println("Intentelo de nuevo...");
				break;
			}
		}while(opcion!=6);

	}

}
