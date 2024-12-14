/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.IncidenciasDto;

/**
 * Interfaz para la operativa de la aplicacion
 * @author rbr - 141224
 *
 */
public interface OperativaInterfaz {

	/**
	 * Enunciado de los metodos que tendra la implementacion
	 * rbr - 141224
	 */
	public List<IncidenciasDto> registrarIncidencia(Scanner scanner, List<IncidenciasDto> lista);
	public void listarIncidencias(List<IncidenciasDto> lista);
	public List<IncidenciasDto> actualizarEstado(List<IncidenciasDto> lista, Scanner scanner);
	public List<IncidenciasDto> eliminarIncidencia(List<IncidenciasDto> lista, Scanner scanner);
	public void buscarIncidencias(List<IncidenciasDto> lista, Scanner scanner);
}
