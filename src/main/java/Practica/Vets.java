package Practica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Representación de mi tabla de base de datos

@Entity
@Table(name = "vets")
public class Vets {

	@Id
	private int id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	@Override
	public String toString() {
		return "Vets [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	
}
