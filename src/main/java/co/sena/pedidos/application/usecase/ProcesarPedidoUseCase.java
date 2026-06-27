package co.sena.pedidos.application.usecase;

import co.sena.pedidos.domain.model.Pedido;

import java.math.BigDecimal;

public interface ProcesarPedidoUseCase {
    Pedido procesar(String idPedido, String cliente, BigDecimal subtotal);
}
