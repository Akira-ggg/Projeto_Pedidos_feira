package br.com.projetopedidos.interfaces;
import br.com.projetopedidos.models.Pedidos;
public interface PedidosInterface {
    public void salvar(Pedidos pedido);
    public void excluir(int id);

}
