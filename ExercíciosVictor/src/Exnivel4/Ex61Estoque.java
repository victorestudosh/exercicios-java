package Exnivel4;

import java.util.ArrayList;
import java.util.List;

public class Ex61Estoque {

    private List<Ex61Produtos> produtos;

    public Ex61Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Ex61Produtos produto) {
        produtos.add(produto);
    }

    public void removerProduto(Ex61Produtos produto) {
        produtos.remove(produto);
    }

    public List<Ex61Produtos> listarProdutos() {
        return produtos;
    }

    public Ex61Produtos buscarProduto(String nome) {

        for (Ex61Produtos produto : produtos) {

            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }

        return null;
    }
}