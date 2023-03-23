package com.autentia.techtest.gastosApp.service;

import com.autentia.techtest.gastosApp.entidades.Amigo;
import com.autentia.techtest.gastosApp.entidades.Gasto;

import java.util.List;
import java.util.Optional;

public interface GastoService {
    public Optional<Gasto> getGasto(Long id);
    public Optional<List<Gasto>> getTotalGastos();
    public Optional<List<Gasto>> getTotalGastos(Amigo amigo);

    void addGasto(Gasto gasto);
}
