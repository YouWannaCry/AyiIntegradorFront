package com.ayi.rest.serv.app.Integrador.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marker")
    private Long idMarker;

    @Column(name = "name")
    private String name;

    @Column(name = "cellphone")
    private String cellphone;

    @Column(name = "longitude", precision = 6)
    public static Double longitude;

    @Column(name = "latitude", precision = 6)
    public static Double latitude;

}