package com.ayi.rest.serv.app.Integrador.entities;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "contacts")
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 15)
    private String name;

    @Column(name = "cellphone", nullable = false, length = 16)
    private String number;

    @ManyToMany(mappedBy = "emergencyContacts")
    Set<Persona> relatedContacts;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}