package com.example.petclinicapp.repository;

import com.example.petclinicapp.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {
}
