package com.bezkoder.spring.datajpa.repository;

import com.bezkoder.spring.datajpa.model.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Long> {
}
