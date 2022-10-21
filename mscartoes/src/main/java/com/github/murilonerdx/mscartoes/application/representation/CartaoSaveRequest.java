package com.github.murilonerdx.mscartoes.application.representation;

import com.github.murilonerdx.mscartoes.model.BandeiraCartao;
import com.github.murilonerdx.mscartoes.model.Cartao;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoSaveRequest {

    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

    public Cartao toModel(){
        return new Cartao(nome, bandeira, renda, limite );
    }
}

