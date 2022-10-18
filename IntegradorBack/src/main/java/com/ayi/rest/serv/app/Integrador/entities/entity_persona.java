package com.ayi.rest.serv.app.Integrador.entities;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "details")

public class entity_persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_details")
    private Long idDetails;

    @Column(name = "name", nullable = false, length = 15)
    private String name;

    @Column(name = "cellphone", nullable = false, length = 16)
    private String number;

    @Column(name = "contacts", nullable = false)
    private List<String> contacts;


}