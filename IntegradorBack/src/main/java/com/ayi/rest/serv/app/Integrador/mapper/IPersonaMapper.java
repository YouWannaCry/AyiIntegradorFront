package com.ayi.rest.serv.app.Integrador.mapper;

import com.ayi.rest.serv.app.Integrador.dto.request.PersonaRequest;
import com.ayi.rest.serv.app.Integrador.dto.response.PersonaResponse;
import com.ayi.rest.serv.app.Integrador.entity.Persona;

public interface IPersonaMapper {

    Persona convertDtoToEntity(PersonaRequest request);

    PersonaResponse convertEntityToDto(Persona entity);
}