package com.biblioteca.Biblioteca.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria  extends ABaseEntity{
    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "codigoUnico", length = 50,nullable = false, unique = true)
    private String codigoUnico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

    public String getCodigoUnico() { return codigoUnico;}

    public void setCodigoUnico(String codigoUnico) { this.codigoUnico = codigoUnico;}

}
