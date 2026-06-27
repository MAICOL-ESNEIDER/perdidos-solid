package co.sena.pedidos.domain.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DescuentoClienteRegular implements PoliticaDescuento {
    private static final BigDecimal PORCENTAJE_DESCUENTO = new BigDecimal("0.05");

    @Override
    public BigDecimal calcular(BigDecimal subtotal) {
        return subtotal.multiply(PORCENTAJE_DESCUENTO).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String descripcion() {
        return "Descuento cliente regular 5%";
    }
}
