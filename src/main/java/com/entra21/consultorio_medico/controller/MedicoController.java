package com.entra21.consultorio_medico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entra21.consultorio_medico.models.MedicoModel;
import com.entra21.consultorio_medico.repositories.MedicoRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/medico")
public class MedicoController {

    @Autowired
    MedicoRepository medicoRepository;

    @PostMapping
    public Long add(@RequestBody MedicoModel medicoREST){
        Long id = 0L;
        if (medicoREST.getId() == 0){
            MedicoModel medico = new MedicoModel();
            medico.setNome(medicoREST.getNome());
            medico.setTelefone(medicoREST.getTelefone());
            medico.setCrm(medicoREST.getCrm());
            medico.setEspecialidade(medicoREST.getEspecialidade());
            medicoRepository.save(medico);
            id = medico.getId();
        }else{
            this.medicoRepository.save(medicoREST);
            id = medicoREST.getId();
            
        }
        return id;
        
        
        
    }
    
}
