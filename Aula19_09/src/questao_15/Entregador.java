package questao_15;

import java.util.ArrayList;
import java.util.List;

public class Entregador {
	private String nome;
    private List<Pedido> pedidos;

    public Entregador(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado: " + pedido);
    }

    public void listarPedidos() {
        System.out.println("Pedidos do entregador " + nome + ":");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public double calcularFaturamento() {
        double total = 0.0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }
}
