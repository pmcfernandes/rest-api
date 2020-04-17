package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PessoaDataLoader implements CommandLineRunner {

    @Autowired
    private PessoaRepository repository;

    @Override
    public void run(String... strings) throws Exception {

        repository.save(Pessoa.builder().nome("João Silva").email("joao.silva@example.com").telefone("+55-71-999999999")
                .empresa("Example Services").categoriaDaEmpresa("Serviços").anosDeMercado(8).build());

        repository.save(
                Pessoa.builder().nome("Maria Santos").email("maria.santos@example.com").telefone("+55-71-888888888")
                        .empresa("Mary Paper").categoriaDaEmpresa("Papelaria").anosDeMercado(8).build());
    }
}