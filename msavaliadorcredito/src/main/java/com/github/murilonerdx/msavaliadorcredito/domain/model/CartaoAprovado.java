package com.github.murilonerdx.msavaliadorcredito.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class CartaoAprovado extends Cartao {
    private String cartao;
    private BigDecimal limiteAprovado;
}

