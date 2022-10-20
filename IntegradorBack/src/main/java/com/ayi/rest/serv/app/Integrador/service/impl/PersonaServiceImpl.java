package com.ayi.rest.serv.app.Integrador.service.impl;

import com.ayi.rest.serv.app.Integrador.dto.request.PersonaRequest;
import com.ayi.rest.serv.app.Integrador.dto.response.PersonaResponse;
import com.ayi.rest.serv.app.Integrador.entity.Persona;
import com.ayi.rest.serv.app.Integrador.mapper.IPersonaMapper;
import com.ayi.rest.serv.app.Integrador.repository.IPersonaRepository;
import com.ayi.rest.serv.app.Integrador.service.IPersonaService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class PersonaServiceImpl implements IPersonaService {

    private IPersonaRepository personaRepository;

    private IPersonaMapper personaMapper;

    private static final String LIST_TYPE_EXCEPTION = "PERSONA";

    public PersonaServiceImpl(IPersonaRepository PersonaRepository,
                             IPersonaMapper PersonaMapper) {
        this.personaRepository = PersonaRepository;
        this.personaMapper = PersonaMapper;
    }

    @Override
    @Transactional
    public PersonaResponse createPersona(PersonaRequest request) {
        Persona persona = personaMapper.convertDtoToEntity(request);

        persona = personaRepository.save(persona);

        return personaMapper.convertEntityToDto(persona);
    }
}