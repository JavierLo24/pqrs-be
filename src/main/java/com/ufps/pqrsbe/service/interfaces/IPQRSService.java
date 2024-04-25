package com.ufps.pqrsbe.service.interfaces;

import com.ufps.pqrsbe.dto.PQRSDTO;
import com.ufps.pqrsbe.dto.SemilleroDTO;

import java.util.List;

public interface IPQRSService {

    public PQRSDTO createPQRS(PQRSDTO pqrsDTO, Integer semilleroID, Integer tipoPQRSID);
    public void cambioEstadoPQRS(Integer pqrsID, Integer nuevoEstadoID);
    public List<PQRSDTO> listarPQRS();
    public List<PQRSDTO> listarPQRSporTipo(Integer tipoID);
    public List<PQRSDTO> listarPQRSporEstado(Integer estadoID);

    public boolean eliminarPQRS (Integer pqrsID);

}
