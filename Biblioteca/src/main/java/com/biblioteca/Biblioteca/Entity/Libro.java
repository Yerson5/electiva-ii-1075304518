package com.biblioteca.Biblioteca.Entity;

import jakarta.persistence.*;
@Entity
@Table(name = "libro")
public class Libro extends ABaseEntity{
    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;

    @Column(name = "autor", length = 50, nullable = false)
    private String autor;

    @Column(name = "añoPublicacion", length = 50, nullable = false)
    private  int anioPublicacion;


    @Column(name = "estado")
    private Boolean estado;
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) { this.autor = autor;}

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) { this.anioPublicacion = anioPublicacion;}

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
