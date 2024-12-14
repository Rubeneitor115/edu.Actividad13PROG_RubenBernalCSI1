/**
 * Ruben Bernal Ramos, CSI1
 */

package dtos;

import java.time.LocalDate;

public class IncidenciasDto {

	//Atributos
	private int id;
    private String descripcion;
    private LocalDate fechaReporte;
    private String estado;

    //Constructor
    public IncidenciasDto(int id, String descripcion, LocalDate fechaReporte, String estado) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaReporte = fechaReporte;
        this.estado = estado;
    }
    public IncidenciasDto() {
    
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaReporte() {
        return fechaReporte;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Metodo toString
    public String toString() {
        return "ID: " + id + ", Descripcion: " + descripcion + ", Fecha: " + fechaReporte + ", Estado: " + estado;
    }
}
