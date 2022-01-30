package com.padroes.chainOfResponsibility;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {

    List<String> itens;
    BigDecimal valor;

    public Pedido(List<String> itens, BigDecimal valor) {
        this.itens = itens;
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public List<String> getItens() {
        return itens;

    }
}
