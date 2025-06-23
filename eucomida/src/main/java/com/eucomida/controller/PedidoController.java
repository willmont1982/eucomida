package com.eucomida.controller;

import com.eucomida.dto.PedidoRequest;
import com.eucomida.dto.PedidoResponse;
import com.eucomida.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<PedidoResponse> criar(@RequestBody PedidoRequest pedidoRequest) {
        PedidoResponse pedidoCriado = pedidoService.criar(pedidoRequest);
        return ResponseEntity.ok(pedidoCriado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoResponse> buscar(@PathVariable Long id) {
        return pedidoService.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

