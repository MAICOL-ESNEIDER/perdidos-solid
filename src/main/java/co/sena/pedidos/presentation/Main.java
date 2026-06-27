package co.sena.pedidos.presentation;

import co.sena.pedidos.application.service.ProcesarPedidoService;
import co.sena.pedidos.application.usecase.ProcesarPedidoUseCase;
import co.sena.pedidos.domain.discount.DescuentoClienteRegular;
import co.sena.pedidos.domain.discount.DescuentoClienteVip;
import co.sena.pedidos.domain.model.Pedido;
import co.sena.pedidos.domain.notification.NotificadorPedido;
import co.sena.pedidos.domain.repository.PedidosRepository;
import co.sena.pedidos.infrastructure.notification.NotificadorPedidoConsola;
import co.sena.pedidos.infrastructure.repository.PedidosRepositoryEnMemoria;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PedidosRepository repositorio = new PedidosRepositoryEnMemoria();
        NotificadorPedido notificador = new NotificadorPedidoConsola();

        ProcesarPedidoUseCase procesadorClienteRegular = new ProcesarPedidoService(
                repositorio,
                notificador,
                new DescuentoClienteRegular()
        );

        ProcesarPedidoUseCase procesadorClienteVip = new ProcesarPedidoService(
                repositorio,
                notificador,
                new DescuentoClienteVip()
        );

        Pedido pedidoRegular = procesadorClienteRegular.procesar(
                "PED-001",
                "Cliente Regular",
                new BigDecimal("100000")
        );

        Pedido pedidoVip = procesadorClienteVip.procesar(
                "PED-002",
                "Cliente VIP",
                new BigDecimal("200000")
        );

        System.out.println();
        System.out.println("=== Pedidos procesados ===");
        System.out.println(pedidoRegular);
        System.out.println(pedidoVip);

        System.out.println();
        System.out.println("Total de pedidos guardados: " + repositorio.listar().size());
    }
}
