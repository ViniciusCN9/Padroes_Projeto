package com.padroes.chainOfResponsibility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChainOfResponsibility {

    public static void main(String[] args) {


        final Pedido pedido1 = new Pedido(new ArrayList<>(List.of("Pneu", "Televisão", "Batedeira")), new BigDecimal("2350.99"));
        final Pedido pedido2 = new Pedido(new ArrayList<>(List.of("Pao", "Macarrão", "Bolacha", "Danone", "Leite", "Margarina", "Arroz", "Feijão", "Milho", "Queijo", "Refrigerante")), new BigDecimal("325.49"));
        final Pedido pedido3 = new Pedido(new ArrayList<>(List.of("Bolo", "Salgado", "Doce")), new BigDecimal("25.32"));

        calculaDesconto(pedido1);
        System.out.println("\n----------");
        calculaDesconto(pedido2);
        System.out.println("\n----------");
        calculaDesconto(pedido3);
        System.out.println("\n----------");
    }

    public static void calculaDesconto(Pedido pedido) {
        final Desconto descontoPorItem = new DescontoPorItens();
        final Desconto descontoPorValor = new DescontoPorValor();
        final Desconto semDesconto = new SemDesconto();

        descontoPorItem.setProximo(descontoPorValor);
        descontoPorValor.setProximo(semDesconto);

        BigDecimal resultado = new BigDecimal(String.valueOf(descontoPorItem.calcular(pedido))) ;
        System.out.printf("%s","\nProdutos comprados: " + pedido.getItens());
        System.out.printf("%s%.2f","\nValor final = R$", resultado);
    }
}
