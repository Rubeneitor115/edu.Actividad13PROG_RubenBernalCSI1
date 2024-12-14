/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import dtos.IncidenciasDto;

/**
 * Implementacion de la interfaz operativa de la aplicacion
 * @author rbr - 141224
 *
 */
public class OperativaImplementacion implements OperativaInterfaz{

	/**
	 * Metodo para registrar una nueva incidencia
	 * rbr - 141224
	 */
	public List<IncidenciasDto> registrarIncidencia(Scanner scanner, List<IncidenciasDto> lista) {
		
		System.out.print("Ingrese el ID de la incidencia: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el estado (Abierta, En Proceso, Resuelta): ");
        String estado = scanner.nextLine();

        IncidenciasDto incidencia = new IncidenciasDto(id, descripcion, LocalDate.now(), estado);
        
        lista.add(incidencia);
        System.out.println("Incidencia registrada con éxito.");
		
        return lista;
	}

	/**
	 * Metodo para listar todas las incidencias
	 * rbr - 141224
	 */
	public void listarIncidencias(List<IncidenciasDto> lista) {
		
        if (lista.isEmpty()) {
            System.out.println("No hay incidencias registradas.");
        } else {
            for(IncidenciasDto incidencia : lista) {
            	System.out.println(incidencia.toString());
            }
        }
	}

	/**
	 * Metodo para actualizar el estado de una incidencia existente
	 * rbr - 141224
	 */
	public List<IncidenciasDto> actualizarEstado(List<IncidenciasDto> lista, Scanner scanner) {
		
		System.out.print("Ingrese el ID de la incidencia a actualizar: ");
        int id = scanner.nextInt();
        for(IncidenciasDto incidencia : lista) {
        	if(incidencia.getId() == id) {
        		System.out.print("Ingrese el nuevo estado: ");
                String nuevoEstado = scanner.nextLine();
                incidencia.setEstado(nuevoEstado);
        	}
        }

        System.out.println("Estado actualizado con éxito.");
		
        return lista;
	}

	/**
	 * Metodo para eliminar una incidencia
	 * rbr - 141224
	 */
	public List<IncidenciasDto> eliminarIncidencia(List<IncidenciasDto> lista, Scanner scanner) {
		
		System.out.print("Ingrese el ID de la incidencia a eliminar: ");
        int id = scanner.nextInt();
        for(IncidenciasDto incidencia : lista) {
        	if(incidencia.getId() == id) {
        		lista.remove(incidencia);
        	}
        }

        System.out.println("Incidencia eliminada con éxito.");
        
		return lista;
	}

	/**
	 * Metodo para buscar una incidencia
	 * rbr - 141224
	 */
	public void buscarIncidencias(List<IncidenciasDto> lista, Scanner scanner) {
		
		System.out.print("Ingrese el ID o palabra clave para buscar: ");
        int id = scanner.nextInt();

        if (lista.isEmpty()) {
            System.out.println("No se encontraron coincidencias.");
        } else {
            for(IncidenciasDto incidencia : lista) {
            	if(incidencia.getId() == id) {
            		System.out.println("Incidencia encontrada: ");
            		System.out.println(incidencia.toString());
            	}
            }
        }
	}
}
