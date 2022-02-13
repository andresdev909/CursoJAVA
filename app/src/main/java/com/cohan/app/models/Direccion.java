package com.cohan.app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Direccion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private long id;
    @Getter @Setter @Column(name = "calle")
    private String calle;
    @Getter @Setter @Column(name = "ciudad")
    private String ciudad;
    @Getter @Setter @Column(name = "estado")
    private String estado;
    @Getter @Setter @Column(name = "codigoP")
    private String codigoPostal;
    @Getter @Setter @Column(name = "pais")
    private String pais;
}
