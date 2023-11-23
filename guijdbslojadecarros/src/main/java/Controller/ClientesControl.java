package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.ClientesDAO;
import Model.Clientes;

public class ClientesControl {

    // atributos
    private List<Clientes> clientes;
    private DefaultTableModel tableModel;

    // construtor
    public ClientesControl(List<Clientes> clientes, DefaultTableModel tableModel, JTable table) {
        this.clientes = clientes;
        this.tableModel = tableModel;
    }

    // métodos

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        clientes = new ClientesDAO().listarTodos();

        // Obtém os carros atualizados do banco de dados
        for (Clientes cliente : clientes) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { cliente.getNome(), cliente.getIdade(),
                    cliente.getCpf() });
        }
    }

    //método Cadastrar
    public void cadastrar(String nome, String idade, String cpf){
        new ClientesDAO().cadastrar(nome, idade, cpf);
        atualizarTabela();
    }

    //método Apagar
    public void apagar(String cpf){
        new ClientesDAO().apagar(cpf);
        atualizarTabela();
    }

    //métodos Atualizar pelo CPF
    public void atualizar(String nome, String idade, String cpf){
        new ClientesDAO().atualizar(nome, idade, cpf);
        atualizarTabela();
    }
}