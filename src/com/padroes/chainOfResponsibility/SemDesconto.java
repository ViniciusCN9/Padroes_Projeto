package com.padroes.chainOfResponsibility;

import java.math.BigDecimal;

public class SemDesconto implements Desconto {

    @Override
    public BigDecimal calcular(Pedido pedido) {
        return BigDecimal.ZERO;
    }

    @Override
    public void setProximo(Desconto desconto) {
        // Não faz nada, é o último nível.
    }
}
