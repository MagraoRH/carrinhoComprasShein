/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.clienteDAO;
import java.util.ArrayList;
import model.cliente;

/**
 *
 * @author Ricardo Henrique
 */
public class clienteServicos {
    
    public void adicionaCliente(cliente cVO) {
        clienteDAO cDAO = dao.daoFactory.getClienteDAO();
        cDAO.cadastrarclienteDAO(cVO);
    }

    public void atualizacliente(cliente cVO) {
        clienteDAO cDAO = dao.daoFactory.getClienteDAO();
        cDAO.atualizarclienteByDoo(cVO);
    }

    public void deletacliente(String cpf) {
        clienteDAO cDAO = dao.daoFactory.getClienteDAO();
        cDAO.deletarclienteDAO(cpf);
    }

    public cliente buscarClientePeloCPF(String cpf) {
        clienteDAO cDAO = dao.daoFactory.getClienteDAO();
        return cDAO.getclienteByDoc(cpf);
    }

    public ArrayList<cliente> listaCliente() {
        clienteDAO cDAO = dao.daoFactory.getClienteDAO();
        return cDAO.getclienteDAO();
    }
}
