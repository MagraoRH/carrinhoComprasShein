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
import model.produto;

/**
 *
 * @author Ricardo Henrique
 */
public class produtoDAO {

    public void adicionarProdutoDAO(produto pVO) {
//busca conecão com o BD
        try {
            Connection con = conexao.getConexao();
            String sql;
            sql = "insert into produto values (null, ?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
            pst.setInt(2, pVO.getQuantidade());
            pst.setFloat(3, pVO.getPreco());
            pst.setString(4, pVO.getCodigoBarras());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar o produto!\n"
                    + ex.getMessage());
        }

    }

    public ArrayList<produto> listarProdutoDAO() {
        ArrayList<produto> produtos = new ArrayList<>();
        try {
            Connection con = conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from produto";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                produto p = new produto();
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setPreco(rs.getFloat("preco"));
                p.setCodigoBarras(rs.getString("codigoBarras"));
                produtos.add(p);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar os produtos!\n"
                    + ex.getMessage());
        }
        return produtos;
    }

    public produto getprodutoByDoc(String idProduto) {
        produto p = new produto();
        try {
            Connection con = conexao.getConexao();
            String sql = "select * from produto where idProduto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(idProduto));
            ResultSet rs = pst.executeQuery();
            p.setIdProduto(rs.getInt("idProduto"));
            p.setNome(rs.getString("nome"));
            p.setQuantidade(rs.getInt("quantidade"));
            p.setPreco(rs.getFloat("preco"));
            p.setCodigoBarras(rs.getString("codigoBarras"));
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar o produto!\n"
                    + ex.getMessage());
        }
        return p;
    }

    public void deletarProdutoDAO(String idProduto) {
        try {
            Connection con = conexao.getConexao();
            String sql = "delete from produto where idProduto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(idProduto));
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar o produto!\n"
                    + ex.getMessage());
        }
    }

    public void atualizarProdutoByDoo(produto pVO) {
        try {
            Connection con = conexao.getConexao();
            String sql = "update produto set nome = ?, quantidade = ?, preco = ?, codigoBarras = ?" + "idProduto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
            pst.setInt(2, pVO.getQuantidade());
            pst.setFloat(3, pVO.getPreco());
            pst.setString(4, pVO.getCodigoBarras());
            pst.setString(5, pVO.getCodigoBarras());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar o produto:\n" + ex.getMessage());
        }
    }

    public float calcularValorTotalProduto() {
        float valorTotal = 0;
        try {
            Connection con = conexao.getConexao();
            String sql = "SELECT SUM(preco * quantidade) AS valorTotal FROM produto";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                valorTotal = rs.getFloat("valorTotal");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao calcular o valor total dos produtos!\n" + ex.getMessage());
        }
        return valorTotal;
    }

    public void deletarTodosProdutos() {
        try {
            Connection con = conexao.getConexao();
            String sql = "DELETE FROM produto";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
        } catch (SQLException ex) {

        }
    }

}
