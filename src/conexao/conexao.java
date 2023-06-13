/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    //cria uma constante com endereco do BD/Schema
    private static String url = "jdbc:mysql://127.0.0.1:3306/carrinho";
    //cria uma constante um ser do BD (Banco de Dados)
    private static String user = "root";
    //cria uma constante com senha do BD (Banco de Dados)
    private static String pass = "";

    public static Connection getConexao() throws SQLException {
        //inicia conexão nula, ainda não estabelecida
        Connection c = null;
        //tenta estabelecer conexão
        try {
            c = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            //caso haja erro na conexão
            throw new SQLException("Erro ao conectar!"
                    + ex.getMessage());
        }
        return c;
    }
}
