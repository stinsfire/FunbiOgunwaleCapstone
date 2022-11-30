package com.company.gamestore.repository;

import com.company.gamestore.model.Console;
import com.company.gamestore.model.SalesTaxRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface SalesTaxRateRepository extends JpaRepository {
    Optional<BigDecimal> findSalesTaxRateByState (String state);
}