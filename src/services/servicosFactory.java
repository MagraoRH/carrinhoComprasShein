/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author Ricardo Henrique
 */
public class servicosFactory {

    private static clienteServicos cServicos = new clienteServicos();
    private static produtoServicos pServicos = new produtoServicos();

    public static clienteServicos getClienteServicos() {
        return cServicos;
    }

    public static produtoServicos getProdutoServicos() {
        return pServicos;
    }
}
