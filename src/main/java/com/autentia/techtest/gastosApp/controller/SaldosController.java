package com.autentia.techtest.gastosApp.controller;

import com.autentia.techtest.gastosApp.entidades.ISaldos;
import com.autentia.techtest.gastosApp.pojo.Balance;
import com.autentia.techtest.gastosApp.service.SaldosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class SaldosController {

    @Autowired
    SaldosService saldosService;

    @PostMapping("/getSaldos")
    public List<ISaldos> getSaldos() {
        return saldosService.getSaldos();
    }
    @PostMapping("/getTotal")
    public BigDecimal getTotal() {
        return saldosService.getTotal();
    }

    @PostMapping("/getGastoMedio")
    public BigDecimal getGastoMedio() {
        return saldosService.getGastoMedio();
    }

    @PostMapping("/getBalances")
    public List<Balance> getBalances() {
        return saldosService.getBalances();
    }

}
