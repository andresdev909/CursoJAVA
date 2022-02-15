package com.cohan.app.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Direccion {

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

    public Direccion()
    {}
    public Direccion(String calle, String ciudad, String estado, String codigo, String pais)
    {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigo;
        this.pais = pais;
    }
}
