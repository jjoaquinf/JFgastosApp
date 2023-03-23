package com.autentia.techtest.gastosApp.repository;

import com.autentia.techtest.gastosApp.entidades.Amigo;
import com.autentia.techtest.gastosApp.entidades.Gasto;
import com.autentia.techtest.gastosApp.entidades.ISaldos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long> {

    List<Gasto> findByAmigo(Amigo amigo);


    @Query(value = "SELECT g.NOMBRE as nombre, (SUM(g.IMPORTE) as importe  FROM GASTO g GROUP BY g.NOMBRE", nativeQuery = true)
    ISaldos getTotalByAmigo();


    @Query(value = "SELECT (SUM(g.IMPORTE) as importe  FROM GASTO g", nativeQuery = true)
    BigDecimal getTotal();

}
