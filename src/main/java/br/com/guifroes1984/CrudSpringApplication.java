package br.com.guifroes1984;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.guifroes1984.model.Curso;
import br.com.guifroes1984.repository.CursoRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(CursoRepository cursoRepository) {
		return Args -> {
			cursoRepository.deleteAll();
			
			Curso c = new Curso();
			c.setNome("Angular com Spring");
			c.setCategoria("Front-End");
			
			cursoRepository.save(c);
		};
	}

}
