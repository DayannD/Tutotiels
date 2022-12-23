package com.bezkoder.spring.datajpa.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tutorials") @Getter @Setter @Builder @NoArgsConstructor
@AllArgsConstructor
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;

	@ManyToOne
	private Formateur formateur;

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}

}
