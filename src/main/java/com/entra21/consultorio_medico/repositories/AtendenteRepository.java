package com.entra21.consultorio_medico.repositories;

import com.entra21.consultorio_medico.models.AtendenteModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendenteRepository extends JpaRepository<AtendenteModel, Long> {
    
}
