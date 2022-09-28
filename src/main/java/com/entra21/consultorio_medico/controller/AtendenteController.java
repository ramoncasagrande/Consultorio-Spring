package com.entra21.consultorio_medico.controller;

import java.util.List;

import com.entra21.consultorio_medico.models.AtendenteModel;
import com.entra21.consultorio_medico.repositories.AtendenteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/atendente")
public class AtendenteController {

    @Autowired
    public AtendenteRepository atendenteRepository;
    
    @PostMapping
    public Long add(@RequestBody AtendenteModel atendenteREST){
        Long id = 0L;
        if (atendenteREST.getId() == 0){
            AtendenteModel atendente = new AtendenteModel();
            atendente.setNome(atendenteREST.getNome());
            atendenteRepository.save(atendente);
            id = atendente.getId();
        }else{
            this.atendenteRepository.save(atendenteREST);
            id = atendenteREST.getId();
            
        }
        return id;
        
        
        
    }

    @GetMapping
    public List<AtendenteModel> listar(){
        return this.atendenteRepository.findAll();
    }
}
