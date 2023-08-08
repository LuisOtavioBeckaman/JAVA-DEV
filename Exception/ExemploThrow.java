package Exception;

import javax.swing.JOptionPane;

/**
 * ExemploThrow
 */
public class ExemploThrow {

    public static void main(String[] args) {
        //
        try {
            JOptionPane.showMessageDialog(null, "Welcome to SENAI");
            String login = JOptionPane.showInputDialog("Informe seu Login");
            String senha = JOptionPane.showInputDialog("Informe sua Senha de 6 Digitos");
            String DiaNasc = JOptionPane.showInputDialog("Informe o dia do seu nascimento");
            String MesNasc = JOptionPane.showInputDialog("Informe o mês do seu nascimento");
            String AnoNasc = JOptionPane.showInputDialog("Informe o ano do seu nascimento");
            if (senha.length() != 6) {
                throw new Exception("Senha deve ter 6 Digitos");
            }
             if (senha.equals(login)) {
                throw new Exception("Senha não deve ser igual ao login");
            }
             if (senha.equals(DiaNasc + DiaNasc + MesNasc)) {
                throw new Exception("Senha não deve ser igual a data de nascimento");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}