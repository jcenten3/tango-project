package com.tango.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "comida")
public class Comida {
	private Long idComida;
	private String descripcion;
	private String diasDisponibles;
	private String nombre;
	private String tipo;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_comida", unique = true, nullable = false)
	public Long getComidaId() {
		return idComida;
	}

	public void setIdComida(Long idComida) {
		this.idComida = idComida;
	}

	@Column(name = "descripcion", length = 100)
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "dias_disponibles", length = 50)
	public String getDiasDisponibles() {
		return diasDisponibles;
	}

	public void setDiasDisponibles(String diasDisponibles) {
		this.diasDisponibles = diasDisponibles;
	}

	@Column(name = "nombre", length = 50)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "tipo", length = 50)
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((diasDisponibles == null) ? 0 : diasDisponibles.hashCode());
		result = prime * result + ((idComida == null) ? 0 : idComida.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comida other = (Comida) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (diasDisponibles == null) {
			if (other.diasDisponibles != null)
				return false;
		} else if (!diasDisponibles.equals(other.diasDisponibles))
			return false;
		if (idComida == null) {
			if (other.idComida != null)
				return false;
		} else if (!idComida.equals(other.idComida))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comida [idComida=" + idComida + ", descripcion=" + descripcion + ", diasDisponibles="
				+ diasDisponibles + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}

}