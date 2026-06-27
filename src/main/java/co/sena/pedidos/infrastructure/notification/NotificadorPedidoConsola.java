package co.sena.pedidos.infrastructure.notification;

import co.sena.pedidos.domain.model.Pedido;
import co.sena.pedidos.domain.notification.NotificadorPedido;

public class NotificadorPedidoConsola implements NotificadorPedido {
    @Override
    public void notificar(Pedido pedido) {
        System.out.println("Notificación enviada: el pedido " + pedido.getId()
                + " del cliente " + pedido.getCliente()
                + " fue procesado por un total de $" + pedido.getTotal());
    }
}
