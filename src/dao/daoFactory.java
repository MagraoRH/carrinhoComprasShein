/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Ricardo Henrique
 */
public class daoFactory {

    private static clienteDAO cDAO = new clienteDAO();
    private static produtoDAO pDAO = new produtoDAO();

    public static clienteDAO getClienteDAO() {
        return cDAO;
    }

    public static produtoDAO getProdutoDAO() {
        return pDAO;
    }
}
