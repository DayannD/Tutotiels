package com.bezkoder.spring.datajpa.model;

import com.bezkoder.spring.datajpa.enums.TypeLangage;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity @Getter @Setter @Builder @AllArgsConstructor @NoArgsConstructor
public class Formateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "Age")
    private int age;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    @Column(name="Type Langage",columnDefinition = "default 'NULL'")
    private List<TypeLangage> typeLangage;

    @OneToMany(mappedBy = "formateur")
    private List<Tutorial> tutorials;
}
