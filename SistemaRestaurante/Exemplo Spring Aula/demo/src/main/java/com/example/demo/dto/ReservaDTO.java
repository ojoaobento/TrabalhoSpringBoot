package com.example.demo.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ReservaDTO {

    private Long id;

    @NotNull(message = "O ID do cliente é obrigatório")
    private Long clienteId;

    @NotNull(message = "O ID da mesa é obrigatório")
    private Long mesaId;

    @NotNull(message = "A data da reserva é obrigatório")
    private LocalDateTime dataReserva;

    @NotNull(message = "A hora da reserva é obrigatório")
    private LocalTime horaReserva;

    @NotBlank(message = "O status é obrigatório")
    @Pattern(
        regexp = "CONFIRMADA|CANCELADA|CONCLUIDA",
        message = "Status deve ser CONFIRMADA, CANCELADA ou CONCLUIDA"      
    )
    private String status;

}
