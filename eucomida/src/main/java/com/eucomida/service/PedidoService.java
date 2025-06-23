package com.eucomida.service;

import com.eucomida.dto.PedidoRequest;
import com.eucomida.dto.PedidoResponse;
import com.eucomida.mapper.PedidoMapper;
import com.eucomida.model.Pedido;
import com.eucomida.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final PedidoMapper pedidoMapper;

    public PedidoService(PedidoRepository pedidoRepository, PedidoMapper pedidoMapper) {
        this.pedidoRepository = pedidoRepository;
        this.pedidoMapper = pedidoMapper;
    }

    public PedidoResponse criar(PedidoRequest pedidoRequest) {
        Pedido pedido = pedidoMapper.toEntity(pedidoRequest);
        pedido.setStatus(Pedido.StatusPedido.EM_ANDAMENTO);
        Pedido salvo = pedidoRepository.save(pedido);
        return pedidoMapper.toResponse(salvo);
    }

    public Optional<PedidoResponse> buscar(Long id) {
        return pedidoRepository.findById(id)
                .map(pedidoMapper::toResponse);
    }
}

