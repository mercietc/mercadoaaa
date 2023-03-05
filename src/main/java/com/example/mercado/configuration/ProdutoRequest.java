package com.example.mercado.configuration;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ProdutoRequest {
    @NotEmpty(message = "O identificador do produto é requerido")
    private String identificador;
    private String nome;
}
