package com.eucomida.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    private LocalDateTime criadoEm = LocalDateTime.now();

    public enum StatusPedido {
        EM_ANDAMENTO, ENTREGUE, CANCELADO
    }

    // Getters e setters
}
