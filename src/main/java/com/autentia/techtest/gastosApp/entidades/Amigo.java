package com.autentia.techtest.gastosApp.entidades;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Amigo {

    public Amigo() {

    }

    public Amigo(String nombre) {
        this.nombre = nombre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "amigo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Gasto> gastoList;
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}