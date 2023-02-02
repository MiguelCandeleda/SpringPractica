package Practica;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

//Método para usar en el servicio

public interface VetRepo extends JpaRepository<Vets, Integer> {
	List<Vets> findbyfirst_name(String first_name);
	List<Vets> findbylast_name(String last_name);

}
