package com.cohan.app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private long id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "telefono")
    private long telefono;
    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "calle")
    private String calle;
    @Getter @Setter @Column(name = "ciudad")
    private String ciudad;
    @Getter @Setter @Column(name = "estado")
    private String estado;
    @Getter @Setter @Column(name = "codigo_postal")
    private String codigoPostal;
    @Getter @Setter @Column(name = "pais")
    private String pais;

}
