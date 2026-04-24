package com.example.demo.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class PedidoDTO {
    
    private Long id;

    @NotNull(message = "O ID da reserva é obrigatório")
    private Long reservaId;

    @NotNull(message = "O ID do item do cardápio é obrigatório")
    private Long itemCardapioId;

    @NotNull(message = "A quantidade é obrigatória")
    @Min(value = 1, message = "A quantidade deve ser maior ou igual a 1")
    private Integer quantidade;

    private BigDecimal valorTotal;
}
