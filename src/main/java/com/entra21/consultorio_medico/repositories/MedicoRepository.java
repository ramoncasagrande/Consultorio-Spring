package com.entra21.consultorio_medico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entra21.consultorio_medico.models.MedicoModel;

@Repository
public interface MedicoRepository extends JpaRepository<MedicoModel, Long> {
    
}
