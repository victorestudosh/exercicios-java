package Exnivel4;

import javax.swing.JOptionPane;

public class Ex59 {
	public static void main(String[] args) {
		Ex56Pessoa pessoa = new Ex56Pessoa("Victor", "13", "01/03/2013", "Masculino", "1.60", "Branca");
		Ex59Corrente conta = new Ex59Corrente(pessoa, 1000.00, 02022026, "091.319.140-04");
		Ex59Poupanca poupanca = new Ex59Poupanca(pessoa, 100.00, 620222020, "442.009.583-83");
		
		conta.depositor(200.00);
		conta.sacar(100.00);
		
		poupanca.depositor(300.00);
		poupanca.sacar(50.0);
		
		JOptionPane.showMessageDialog(null, "Criar Herança (ContaCorrente, ContaPoupanca)", "Ex59", JOptionPane.INFORMATION_MESSAGE, null);
		
		JOptionPane.showMessageDialog(null, "Saldo da conta corrente: " + conta.getPreco(), null, JOptionPane.INFORMATION_MESSAGE, null);
		JOptionPane.showMessageDialog(null, "Saldo da conta poupança: "+ poupanca.getPreco(), null, JOptionPane.INFORMATION_MESSAGE, null);
		
	}
}