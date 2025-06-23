package com.eucomida.service;

import com.eucomida.model.Pedido;
import com.eucomida.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {
    private final PedidoRepository repo;

    public PedidoService(PedidoRepository repo) {
        this.repo = repo;
    }

    public Pedido criar(Pedido pedido) {
        pedido.setStatus(Pedido.StatusPedido.EM_ANDAMENTO);
        return repo.save(pedido);
    }

    public Optional<Pedido> buscar(Long id) {
        return repo.findById(id);
    }
}
