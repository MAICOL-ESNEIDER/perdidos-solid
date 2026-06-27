package co.sena.pedidos.domain.repository;

import co.sena.pedidos.domain.model.Pedido;

import java.util.List;

public interface PedidosRepository {
    void guardar(Pedido pedido);

    List<Pedido> listar();
}
