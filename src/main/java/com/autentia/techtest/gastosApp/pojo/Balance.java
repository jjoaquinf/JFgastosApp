package com.autentia.techtest.gastosApp.pojo;

import com.autentia.techtest.gastosApp.entidades.ISaldos;

import java.util.List;

public class Balance {

    public String nombre;

    public List<ISaldos> deudores;

    public Balance(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ISaldos> getDeudores() {
        return deudores;
    }

    public void setDeudores(List<ISaldos> deudores) {
        this.deudores = deudores;
    }
}
