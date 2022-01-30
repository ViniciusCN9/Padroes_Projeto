package com.padroes.chainOfResponsibility;

import java.math.BigDecimal;

public class DescontoPorValor implements Desconto {

    private Desconto proximo;

    @Override
    public BigDecimal calcular(Pedido pedido) {
        if(pedido.getValor().doubleValue() > 1000.0) {
            return pedido.getValor().multiply(BigDecimal.valueOf(0.10));
        } else {
            return proximo.calcular(pedido);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
