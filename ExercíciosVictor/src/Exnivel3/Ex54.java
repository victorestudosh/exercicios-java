package Exnivel3;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ex54 {

    public static void main(String[] args) {
        JTextField campoGmail = new JTextField(15);
        JPasswordField campoSenha = new JPasswordField(15);
        JCheckBox mostrarSenha = new JCheckBox("Mostrar senha");

        mostrarSenha.addActionListener(e -> {
            if (mostrarSenha.isSelected()) {
                campoSenha.setEchoChar((char) 0);
            } else {
                campoSenha.setEchoChar('•');
            }
        });

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.add(new JLabel("Gmail:"));
        painel.add(campoGmail);
        painel.add(Box.createVerticalStrut(10));
        painel.add(new JLabel("Senha:"));
        painel.add(campoSenha);
        painel.add(mostrarSenha);

        JOptionPane.showMessageDialog(null, "Sistema de login simulado (codificado)", "Ex54", JOptionPane.INFORMATION_MESSAGE);
        
        int opcao = JOptionPane.showConfirmDialog(null, painel, "Login", JOptionPane.OK_CANCEL_OPTION);

        if (opcao == JOptionPane.OK_OPTION) {
            String emailDigitado = campoGmail.getText();
            cadastroGmail(emailDigitado);
        }
    }

    public static void cadastroGmail(String email) {
        if (!email.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "O email precisa ser do tipo (Gmail)", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else if (email.equalsIgnoreCase(email)) {
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado ✅", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ainda não Cadastrado ❎", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
