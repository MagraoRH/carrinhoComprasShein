/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.produtoDAO;
import java.util.ArrayList;
import model.produto;

/**
 *
 * @author Ricardo Henrique
 */
public class produtoServicos {

    public void adicionaProduto(produto pVO) {
        produtoDAO pDAO = dao.daoFactory.getProdutoDAO();
        pDAO.adicionarProdutoDAO(pVO);
    }

    public void atualizaProduto(produto pVO) {
        produtoDAO pDAO = dao.daoFactory.getProdutoDAO();
        pDAO.atualizarProdutoByDoo(pVO);
    }

    public void deletaProduto(String idProduto) {
        produtoDAO pDAO = dao.daoFactory.getProdutoDAO();
        pDAO.deletarProdutoDAO(idProduto);
    }

    public produto buscaProdutoPeloCodigoBarras(String idProduto) {
        produtoDAO pDAO = dao.daoFactory.getProdutoDAO();
        return pDAO.getprodutoByDoc(idProduto);
    }

    public ArrayList<produto> listaProduto() {
        produtoDAO pDAO = dao.daoFactory.getProdutoDAO();
        return pDAO.listarProdutoDAO();
    }

    public float calcularValorTotalProduto() {
        produtoDAO pDAO = dao.daoFactory.getProdutoDAO();
        return pDAO.calcularValorTotalProduto();
    }

    public void deletaTODOSprodutos() throws Exception {
        produtoDAO pDAO = dao.daoFactory.getProdutoDAO();
        pDAO.deletarTodosProdutos();
    }
}
