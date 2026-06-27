package co.sena.pedidos.domain.notification;

import co.sena.pedidos.domain.model.Pedido;

public interface NotificadorPedido {
    void notificar(Pedido pedido);
}
