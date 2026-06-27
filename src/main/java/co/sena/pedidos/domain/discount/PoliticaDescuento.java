package co.sena.pedidos.domain.discount;

import java.math.BigDecimal;

public interface PoliticaDescuento {
    BigDecimal calcular(BigDecimal subtotal);

    String descripcion();
}
