package com.example.demo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MesaDTO {
    
    private Long id;

    @NotNull(message = "O número da mesa é essencial para definir sua funcionalidade")
    @Positive(message = "Insira um valor positivo para o numero")
    private Integer numero;

    @NotNull(message = "Insira um valor para a capacidade da mesa")
    @Min(value = 1, message = "Toda mesa precisa possuir um numero mínimo")
    private Integer capacidade;

    @NotBlank(message = "O status da mesa é obrigatório")
    @Pattern(
        regexp = "(?i)^(LIVRE|OCUPADA|RESERVADA)$",
        message = "Status deve ser LIVRE, OCUPADA ou RESERVADA"      
    )
    private String status;

}
