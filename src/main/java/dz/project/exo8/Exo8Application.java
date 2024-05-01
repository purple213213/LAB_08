package dz.project.exo8;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Map;
import org.springframework.web.bind.annotation.RestController;

@RestController

@SpringBootApplication //exclude = {DataSourceAutoConfiguration.class })

//@ComponentScan("dz.project.exo8")


public class Exo8Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Exo8Application.class, args);
	}


	 @Autowired
	   JdbcTemplate jdbctemplate;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		List<Map<String,Object>> entities =jdbctemplate.queryForList("Select * From wilaya");
		for(Map<String,Object> row : entities) {	
			System.out.println("***************************************");
			System.out.println("ID: "+ row.get("id"));
			System.out.println("Actif: "+ row.get("actif"));
			System.out.println("Actif: "+ row.get("compte_creation"));
			System.out.println("compte_maj: "+ row.get("compte_maj"));
			System.out.println("datecreation :"+ row.get("date_creation"));
			System.out.println("nom_tamazight: "+ row.get("nom_tamazight"));
			System.out.println("Nom_latin: "+ row.get("Nom_latin"));
			System.out.println("Nom_arabe: "+ row.get("Nom_arabe"));
			System.out.println("***************************************");


				
		}
	}}
		/* List<ClassBDD> entities = jdbctemplate.query("SELECT * FROM wilaya",
		            (rs, rowNum) -> {
		                ClassBDD entity = new ClassBDD();
		              
		                entity.setActif(rs.getBoolean("Actif")); 
		                entity.setId(rs.getInt("id"));
		                entity.setCompte_creation(rs.getInt("compte_creation"));
		                entity.setCompte_maj(rs.getInt("compte_maj"));
		                entity.setDate_creation(rs.getDate("date_creation"));
		                entity.setDate_maj(rs.getDate("Date_maj"));
		                entity.setNom_tamazight(rs.getString("nom_tamazight"));
		                entity.setNom_latin(rs.getString("Nom_latin"));        
		                entity.setNom_arabe(rs.getString("Nom_arabe"));
		    
		                return entity;
		            });

		    // Afficher les objets dans la console
		    entities.forEach(entity -> System.out.println(entity.toString()));
		
		
		
	}

	  
		
	
	
	
}*/
