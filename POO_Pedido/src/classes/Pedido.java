/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus
 */
public class Pedido extends Operacao {
    private int codigo;
    protected Vendedor vendedor;
    protected Cliente cliente;
    private ArrayList<Produto> listaProdutos;
    
    public Pedido() {
        vendedor = new Vendedor();
        cliente = new Cliente();
        listaProdutos = new ArrayList();
    }
    
    public boolean verificaProdutoUnico(Produto produto) {
        for (Produto compProduto : listaProdutos) {
            if (compProduto.getDescricao().equalsIgnoreCase(produto.getDescricao()))
                return true;
        }
        return false;
    }
    
    public boolean addProduto(Produto produto) {
        if (!verificaProdutoUnico(produto)) {
            listaProdutos.add(produto);
            return true;
        } else
            return false;
    }
    
    public double totalPedido() {
        double total = 0;
        for (Produto produto: listaProdutos)
            total += produto.totalItem();    
        return total;
    }
    
    public double valorMedio() {
        double valorMedio = 0;
        for (Produto produto: listaProdutos)
            valorMedio += produto.getValor();
        return valorMedio / listaProdutos.size();
    }
    
    public List<Produto> quantidadeMaior(int quantidade) {
        ArrayList<Produto> prodQuantMaior = new ArrayList();
        for (Produto produto: listaProdutos) {
            if (produto.getQuantidade() > quantidade)
                prodQuantMaior.add(produto);
        }
        return prodQuantMaior;
    }
    
    public String nomeVendedor() {
        return vendedor.getNome();
    }
    
    public String emailCliente() {
        return cliente.getEmail();
    }
    
    public List<Produto> buscaProdutoDescricao(String descricao) {
        ArrayList<Produto> prodDescricao = new ArrayList();
        for (Produto produto: listaProdutos) {
            if (produto.getDescricao().startsWith(descricao))
                prodDescricao.add(produto);
        }
        return prodDescricao;
    }
    
    public int dias() {
        double result = 0;
        long diferenca = super.getDtFim().getTime() - super.getDtInicio().getTime();
        double diferencaDias = (diferenca / 1000) / 60 / 60 / 24;
        long horasRestantes = (diferenca / 1000) / 60 / 60 % 24;
        result = diferencaDias + (horasRestantes / 24d);
        return (int) result;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", vendedor=" + vendedor + ", cliente=" + cliente + ", listaProdutos=" + listaProdutos + '}';
    }
    
}
