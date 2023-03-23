package com.autentia.techtest.gastosApp.service;

import com.autentia.techtest.gastosApp.entidades.Amigo;
import com.autentia.techtest.gastosApp.entidades.Gasto;
import com.autentia.techtest.gastosApp.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class GastoServiceImpl implements GastoService {


    @Autowired
    GastoRepository gastoRepository;

    @Override
    public void addGasto(Gasto gasto) {
        gastoRepository.save(gasto);
    }
    @Override
    public Optional<Gasto> getGasto(Long id) {
        return gastoRepository.findById(id);
    }

    @Override
    public Optional<List<Gasto>> getTotalGastos() {
        return Optional.of(gastoRepository.findAll());
    }

    @Override
    public Optional<List<Gasto>> getTotalGastos(Amigo amigo) {
        return Optional.of(gastoRepository.findByAmigo(amigo));
    }

}
