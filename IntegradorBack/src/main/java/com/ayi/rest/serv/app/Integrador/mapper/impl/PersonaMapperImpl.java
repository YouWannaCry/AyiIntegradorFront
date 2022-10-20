package com.ayi.rest.serv.app.Integrador.mapper.impl;

import com.ayi.rest.serv.app.Integrador.dto.request.PersonaRequest;
import com.ayi.rest.serv.app.Integrador.dto.response.PersonaResponse;
import com.ayi.rest.serv.app.Integrador.entity.Persona;
import com.ayi.rest.serv.app.Integrador.mapper.IPersonaMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PersonaMapperImpl implements IPersonaMapper {

    private final ModelMapper modelMapper;

    @Override
    public Persona convertDtoToEntity(PersonaRequest request) {
        return modelMapper.map(request, Persona.class);
    }

    @Override
    public PersonaResponse convertEntityToDto(Persona entity) {
        return modelMapper.map(entity, PersonaResponse.class);
    }
}