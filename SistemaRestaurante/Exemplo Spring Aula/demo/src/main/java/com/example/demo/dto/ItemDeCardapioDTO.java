package com.example.demo.dto;


import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ItemDeCardapioDTO {
    
    private Long id;

    @NotNull(message = "O nome do item e obrigatorio")
    private String nome;

    @NotNull(message = "A descricao do item e obrigatoria")
    private String Descricao;

    @NotNull(message = "O preco do item e obrigatorio")
    private BigDecimal preco;
}
