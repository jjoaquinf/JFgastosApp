package com.autentia.techtest.gastosApp.repository;

import com.autentia.techtest.gastosApp.entidades.Amigo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmigoRepository extends JpaRepository<Amigo, Long> {
}
