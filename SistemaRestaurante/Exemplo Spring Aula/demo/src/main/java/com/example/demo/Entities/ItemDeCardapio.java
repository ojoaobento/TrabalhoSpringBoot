package com.example.demo.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "ItemDeCardapio")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

public class ItemDeCardapio{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Nome;

    @Column(nullable = false)
    private String Descricao;

    @Column(nullable = false)
    private BigDecimal Preco;
}

