package co.sena.pedidos.application.service;

import co.sena.pedidos.application.usecase.ProcesarPedidoUseCase;
import co.sena.pedidos.domain.discount.PoliticaDescuento;
import co.sena.pedidos.domain.model.Pedido;
import co.sena.pedidos.domain.notification.NotificadorPedido;
import co.sena.pedidos.domain.repository.PedidosRepository;

import java.math.BigDecimal;
import java.util.Objects;

public class ProcesarPedidoService implements ProcesarPedidoUseCase {
    private final PedidosRepository pedidosRepository;
    private final NotificadorPedido notificadorPedido;
    private final PoliticaDescuento politicaDescuento;

    public ProcesarPedidoService(
            PedidosRepository pedidosRepository,
            NotificadorPedido notificadorPedido,
            PoliticaDescuento politicaDescuento
    ) {
        this.pedidosRepository = Objects.requireNonNull(pedidosRepository, "El repositorio es obligatorio");
        this.notificadorPedido = Objects.requireNonNull(notificadorPedido, "El notificador es obligatorio");
        this.politicaDescuento = Objects.requireNonNull(politicaDescuento, "La política de descuento es obligatoria");
    }

    @Override
    public Pedido procesar(String idPedido, String cliente, BigDecimal subtotal) {
        validarDatos(idPedido, cliente, subtotal);

        BigDecimal descuento = politicaDescuento.calcular(subtotal);
        BigDecimal total = subtotal.subtract(descuento);

        Pedido pedido = new Pedido(idPedido, cliente, subtotal, descuento, total);

        pedidosRepository.guardar(pedido);
        notificadorPedido.notificar(pedido);

        return pedido;
    }

    private void validarDatos(String idPedido, String cliente, BigDecimal subtotal) {
        if (idPedido == null || idPedido.isBlank()) {
            throw new IllegalArgumentException("El id del pedido es obligatorio");
        }

        if (cliente == null || cliente.isBlank()) {
            throw new IllegalArgumentException("El cliente es obligatorio");
        }

        if (subtotal == null || subtotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El subtotal debe ser mayor que cero");
        }
    }
}
