/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ricardo Henrique
 */
public class produto {

    int idProduto;
    String nome;
    int quantidade;
    float preco;
    String codigoBarras;

    public produto() {
    }

    public produto(int idProduto, String nome, int quantidade, float preco, String codigoBarras) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public String toString() {
        return "produto{" + "idProduto=" + idProduto + ", nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + ", codigoBarras=" + codigoBarras + '}';
    }
}
