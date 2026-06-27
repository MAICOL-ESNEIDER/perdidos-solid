package co.sena.pedidos.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Pedido {
    private final String id;
    private final String cliente;
    private final BigDecimal subtotal;
    private final BigDecimal descuento;
    private final BigDecimal total;
    private final LocalDateTime fechaProcesamiento;

    public Pedido(String id, String cliente, BigDecimal subtotal, BigDecimal descuento, BigDecimal total) {
        this.id = Objects.requireNonNull(id, "El id del pedido es obligatorio");
        this.cliente = Objects.requireNonNull(cliente, "El cliente es obligatorio");
        this.subtotal = Objects.requireNonNull(subtotal, "El subtotal es obligatorio");
        this.descuento = Objects.requireNonNull(descuento, "El descuento es obligatorio");
        this.total = Objects.requireNonNull(total, "El total es obligatorio");
        this.fechaProcesamiento = LocalDateTime.now();

        if (subtotal.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El subtotal no puede ser negativo");
        }

        if (total.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El total no puede ser negativo");
        }
    }

    public String getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public LocalDateTime getFechaProcesamiento() {
        return fechaProcesamiento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", cliente='" + cliente + '\'' +
                ", subtotal=" + subtotal +
                ", descuento=" + descuento +
                ", total=" + total +
                ", fechaProcesamiento=" + fechaProcesamiento +
                '}';
    }
}
