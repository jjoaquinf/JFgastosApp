package com.autentia.techtest.gastosApp.service;

import com.autentia.techtest.gastosApp.pojo.Balance;
import com.autentia.techtest.gastosApp.entidades.ISaldos;

import java.math.BigDecimal;
import java.util.List;

public interface SaldosService {

    public BigDecimal getTotal();

    public BigDecimal getGastoMedio();

    public List<ISaldos> getSaldos();

    public List<Balance> getBalances();
}
