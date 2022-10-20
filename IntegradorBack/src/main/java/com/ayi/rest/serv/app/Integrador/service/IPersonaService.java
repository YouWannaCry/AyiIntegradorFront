package com.ayi.rest.serv.app.Integrador.service;

import com.ayi.rest.serv.app.Integrador.dto.request.PersonaRequest;
import com.ayi.rest.serv.app.Integrador.dto.response.PersonaResponse;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public interface IPersonaService {

    @Transactional
    PersonaResponse createPersona(PersonaRequest request);
}