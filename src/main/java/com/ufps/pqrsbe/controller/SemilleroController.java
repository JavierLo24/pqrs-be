package com.ufps.pqrsbe.controller;

import com.ufps.pqrsbe.dto.PQRSDTO;
import com.ufps.pqrsbe.dto.SemilleroDTO;
import com.ufps.pqrsbe.service.implementations.SemilleroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/semilleros")
public class SemilleroController {

    @Autowired
    SemilleroService semilleroService;

    @GetMapping
    public List<SemilleroDTO> listarSemilleros() {
        return semilleroService.listarSemilleros();
    }

}
