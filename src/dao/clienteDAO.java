/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.cliente;

/**
 *
 * @author Ricardo Henrique
 */
public class clienteDAO {

    public void cadastrarclienteDAO(cliente cVO) {
//busca conecão com o BD
        try {
            Connection con = conexao.getConexao();
            String sql;
            sql = "insert into cliente values (null, ?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getCpf());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }

    }

    public ArrayList<cliente> getclienteDAO() {
        ArrayList<cliente> clientes = new ArrayList<>();
        try {
            Connection con = conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from cliente";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                cliente c = new cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar!\n"
                    + ex.getMessage());
        }
        return clientes;
    }

    public cliente getclienteByDoc(String cpf) {
        cliente c = null;
        try {
            Connection con = conexao.getConexao();
            String sql = "SELECT * FROM cliente WHERE cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                c = new cliente();
                c.setIdCliente(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
            }

            rs.close();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar CPF!\n" + ex.getMessage());
        }
        return c;
    }

    public void deletarclienteDAO(String cpf) {
        try {
            Connection con = conexao.getConexao();
            String sql = "delete from cliente where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar CPF!\n"
                    + ex.getMessage());
        }
    }

    public void atualizarclienteByDoo(cliente cVO) {
        try {
            Connection con = conexao.getConexao();
            String sql = "update cliente set nome = ? " + "where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getCpf());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar CPF:\n" + ex.getMessage());
        }
    }
}
