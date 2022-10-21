package com.github.murilonerdx.mscartoes.application;

import com.github.murilonerdx.mscartoes.infra.repository.ClienteCartaoRepository;
import com.github.murilonerdx.mscartoes.model.ClienteCartao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {

    private final ClienteCartaoRepository repository;

    public List<ClienteCartao> listCartoesByCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}

