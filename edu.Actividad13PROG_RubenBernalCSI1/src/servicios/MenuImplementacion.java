/**
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

/**
 * Implementacion de la interfaz para el menu
 * @author rbr - 141224
 *
 */
public class MenuImplementacion implements MenuInterfaz{

	/**
	 * Metodo que mostrara el menu de la aplicacion por consola
	 * rbr - 141224
	 */
	public void mostrarMenu() {
		
		System.out.println("\n---- Gestión de Incidencias ----");
        System.out.println("1. Registrar Incidencia");
        System.out.println("2. Listar Incidencias");
        System.out.println("3. Actualizar Estado de Incidencia");
        System.out.println("4. Eliminar Incidencia");
        System.out.println("5. Buscar Incidencias");
        System.out.println("6. Salir");
        System.out.println("-----------------------------------");
        System.out.print("Seleccione una opción: ");
		
	}

}
