package Practica;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DBOperation implements CommandLineRunner {

	@Autowired
	VetRepo vRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		vRepo.saveAll(Arrays.asList(
				new Vets(1, "Ramón", "Pérez"),
				new Vets(2, "Lucía", "González"),
				new Vets(3, "Blanca", "Sánchez"))
			);
		
		vRepo.deleteAll();
	}
	
	
}
