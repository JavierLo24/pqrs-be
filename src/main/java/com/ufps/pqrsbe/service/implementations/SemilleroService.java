package com.ufps.pqrsbe.service.implementations;

import com.ufps.pqrsbe.dto.PQRSDTO;
import com.ufps.pqrsbe.dto.SemilleroDTO;
import com.ufps.pqrsbe.repository.SemilleroRepo;
import com.ufps.pqrsbe.service.interfaces.ISemilleroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("semilleroService")
public class SemilleroService implements ISemilleroService {

    @Autowired
    SemilleroRepo semilleroRepo;

    @Override
    public List<SemilleroDTO> listarSemilleros() {
        return semilleroRepo.findAll().stream().map(semillero -> {
            new SemilleroDTO();
            return SemilleroDTO.builder()
                    .id(semillero.getId())
                    .name(semillero.getName())
                    .id_grupo(semillero.getId_grupo())
                    .id_lider(semillero.getId_lider())
                    .lineaInvestigacion(semillero.getLineaInvestigacion())
                    .descripcion(semillero.getDescripcion())
                    .Logo(semillero.getLogo())
                    .build();
        }).collect(Collectors.toList());
    }

}
