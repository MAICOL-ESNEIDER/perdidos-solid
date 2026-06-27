package co.sena.pedidos.infrastructure.repository;

import co.sena.pedidos.domain.model.Pedido;
import co.sena.pedidos.domain.repository.PedidosRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PedidosRepositoryEnMemoria implements PedidosRepository {
    private final List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void guardar(Pedido pedido) {
        pedidos.add(pedido);
    }

    @Override
    public List<Pedido> listar() {
        return Collections.unmodifiableList(pedidos);
    }
}
