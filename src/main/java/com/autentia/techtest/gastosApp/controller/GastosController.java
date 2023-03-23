package com.autentia.techtest.gastosApp.controller;

import com.autentia.techtest.gastosApp.entidades.Amigo;
import com.autentia.techtest.gastosApp.entidades.Gasto;
import com.autentia.techtest.gastosApp.service.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RestController
public class GastosController {

    @Autowired
    GastoService gastoService;

    @PostMapping("/addGasto")
    public void addGasto(@RequestBody Gasto gasto) {
        gastoService.addGasto(gasto);
        ResponseEntity.ok();
    }

    @PostMapping("/getGastos")
    public List<Gasto> getGastos() {
        return gastoService.getTotalGastos().orElse(new ArrayList<Gasto>());
    }

    @PostMapping("/gastosByAmigo")
    public List<Gasto> gastosByAmigo(@RequestBody Amigo amigo) {
        return gastoService.getTotalGastos(amigo).orElse(new ArrayList<>());
    }
}
