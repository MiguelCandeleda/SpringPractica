package Practica;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Método para usar en el servicio


@Repository
public interface VetRepo extends JpaRepository<Vets, Integer> {
	List<Vets> findbyfirst_name(String first_name);
	List<Vets> findbylast_name(String last_name);

}
