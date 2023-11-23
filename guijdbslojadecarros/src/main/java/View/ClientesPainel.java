package View;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Connection.ClientesDAO;
import Controller.ClientesControl;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Model.Clientes;

public class ClientesPainel extends JPanel {
    // atributos
    private JButton cadastrar, apagar, editar;
    private JTextField clientNomeField, clientIdadeField, clientCpfField;

    private List<Clientes> clientes;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    // construtor
    public ClientesPainel() {
        super();
        // entrada de dados
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Clientes"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        inputPanel.add(new JLabel("Nome"));
        clientNomeField = new JTextField(20);
        inputPanel.add(clientNomeField);

        inputPanel.add(new JLabel("Idade"));
        clientIdadeField = new JTextField(20);
        inputPanel.add(clientIdadeField);

        inputPanel.add(new JLabel("Cpf"));
        clientCpfField = new JTextField(20);
        inputPanel.add(clientCpfField);
        add(inputPanel);
        JPanel botoes = new JPanel();

        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);

        // tabela de carros

        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {},
                new String[] { "Nome", "Idade", "Cpf" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        // Criar a Tabela se ela não existir

        new ClientesDAO().criaTabela();

        // atualizar a tabela na abertura da janela

        atualizarTabela();

        // tratamento de eventos(construtor)

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    clientNomeField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    clientIdadeField.setText((String) table.getValueAt(linhaSelecionada, 1));
                    clientCpfField.setText((String) table.getValueAt(linhaSelecionada, 2));
                }
            }
        });

        ClientesControl operacoes = new ClientesControl(clientes, tableModel, table);
        // Configura a ação do botão "cadastrar" para adicionar um novo registro no
        // banco de dados
        cadastrar.addActionListener(e -> {
            // Chama o método "cadastrar" do objeto operacoes com os valores dos
            // campos de entrada
            operacoes.cadastrar(clientNomeField.getText(), clientIdadeField.getText(),
                    clientCpfField.getText());
            // Limpa os campos de entrada após a operação de cadastro
            clientNomeField.setText("");
            clientIdadeField.setText("");
            clientCpfField.setText("");

        });

        // Configura a ação do botão "Editar" para adicionar um novo registro no
        // banco de dados
        apagar.addActionListener(e -> {
            // Chama o método "cadastrar" do objeto operacoes com os valores dos
            // campos de entrada
            operacoes.apagar(clientCpfField.getText());
            // Limpa os campos de entrada após a operação de cadastro
            clientNomeField.setText("");
            clientIdadeField.setText("");
            clientCpfField.setText("");
        });
        // Configura a ação do botão "Editar" para adicionar um novo registro no
        // banco de dados
        editar.addActionListener(e -> {
            // Chama o método "cadastrar" do objeto operacoes com os valores dos
            // campos de entrada
            operacoes.atualizar(clientNomeField.getText(), clientIdadeField.getText(),
                    clientCpfField.getText());
            // Limpa os campos de entrada após a operação de cadastro
            clientNomeField.setText("");
            clientIdadeField.setText("");
            clientCpfField.setText("");
        });

    }

    // métodos (atualizar tabela)
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

}