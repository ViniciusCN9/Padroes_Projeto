package com.padroes.chainOfResponsibility;

import java.math.BigDecimal;

public interface Desconto {

    BigDecimal calcular(Pedido pedido);

    void setProximo(Desconto proximo);
}
