package com.bezkoder.spring.datajpa;

import com.bezkoder.spring.datajpa.enums.TypeLangage;
import com.bezkoder.spring.datajpa.model.Formateur;
import com.bezkoder.spring.datajpa.model.Tutorial;
import com.bezkoder.spring.datajpa.repository.FormateurRepository;
import com.bezkoder.spring.datajpa.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.text.Format;
import java.util.Arrays;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	@Autowired
	FormateurRepository formateurRepository;
	@Autowired
	TutorialRepository tutorialRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}


	@PostConstruct
	public void construct(){
		for (int i = 0; i < 10; i++) {
			Formateur _formateur = Formateur.builder()
					.age(59)
					.nom("Thierry")
					.build();
			formateurRepository.save(_formateur);

			Tutorial _tutorial = Tutorial.builder()
							.title("titre")
							.description("description")
							.formateur(_formateur)
							.published(false)
							.build();
			tutorialRepository.save(_tutorial);
		}
		;
	}
}
