/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ricardo Henrique
 */
public class cliente {

    int idCliente;
    String nome;
    String cpf;

    public cliente() {
    }

    public cliente(int idCliente, String nome, String cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "cliente{" + "idCliente=" + idCliente + ", nome=" + nome + ", cpf=" + cpf + '}';
    }

}
