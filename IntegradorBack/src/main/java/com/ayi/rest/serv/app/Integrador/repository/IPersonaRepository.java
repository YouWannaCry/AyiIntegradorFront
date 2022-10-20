package com.ayi.rest.serv.app.Integrador.repository;

import com.ayi.rest.serv.app.Integrador.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}