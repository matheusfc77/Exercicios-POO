/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author matheus
 */
public class TestePedido {
    public static void main(String[] args) {
        Pedido p1 = new Pedido();
        p1.cliente.setCodigo(0110102010);
        p1.cliente.setEmail("cliente@gmail.com");
        p1.cliente.setNome("Matheus");
        p1.vendedor.setCodigo(123122312);
        p1.vendedor.setNome("Leticia");
        p1.setCodigo(321322132);
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.MONTH, 8);
        cal.set(Calendar.YEAR, 2019);
        cal.set(Calendar.HOUR_OF_DAY, 9);
        Date dt1 = cal.getTime();
        Date dt2 = new Date();
        p1.setDtFim(dt2);
        p1.setDtInicio(dt1);
        
        Produto pd1 = new Produto();
        pd1.setDescricao("Teclado");
        pd1.setQuantidade(100);
        pd1.setValor(800.00);
        
        Produto pd2 = new Produto();
        pd2.setDescricao("Televisão");
        pd2.setQuantidade(500);
        pd2.setValor(1200.00);
        
        Produto pd3 = new Produto();
        pd3.setDescricao("Telefone");
        pd3.setQuantidade(1000);
        pd3.setValor(200.0);
        
        p1.addProduto(pd1);
        p1.addProduto(pd2);
        p1.addProduto(pd3);
        
        System.out.println(p1.buscaProdutoDescricao("Tel"));
        System.out.println(p1.dias());
        System.out.println(p1.emailCliente());
        System.out.println(p1.nomeVendedor());
        System.out.println(p1.quantidadeMaior(200));
        System.out.println(p1.totalPedido());
        System.out.println(p1.valorMedio());
        
        
    }
}
