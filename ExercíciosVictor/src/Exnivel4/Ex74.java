package Exnivel4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ex74 {
	public static void main(String[] args) {
		ArrayList<Ex74Agenda> tarefas = new ArrayList<>();
		
		String input1 = "";
		
		
		while (!input1.equals("5")) {
			StringBuilder sb = new StringBuilder("Informações Agenda --------👇\n\n");
			sb
			.append("1 - Adicionar Tarefa\n")
			.append("2 - Mostrar Tarefas\n")
			.append("3 - Remover Tarefa\n")
			.append("4 - Concluir Tarefa\n")
			.append("5 - Sair");
			
			String input = JOptionPane.showInputDialog(null, sb, null, JOptionPane.INFORMATION_MESSAGE);
			
			if (input.equals("1")) {
				
				String nomeTarefa = JOptionPane.showInputDialog(null, "Nome Tarefa:", "", JOptionPane.INFORMATION_MESSAGE);

				String dataTarefa = JOptionPane.showInputDialog(null, "Data tarefa:", "", JOptionPane.INFORMATION_MESSAGE);

				tarefas.add(new Ex74Agenda(nomeTarefa, dataTarefa, false));

				JOptionPane.showMessageDialog(null, "Tarefa Adicionada!", "", JOptionPane.INFORMATION_MESSAGE, null);

			} else if (input.equals("2")) {

				StringBuilder lista = new StringBuilder("Tarefas: \n\n");

				for (Ex74Agenda tarefa : tarefas) {
					lista.append("Tarefa: " + tarefa.getNomeTarefa() + "\n").append("Data: " + tarefa.getData()).append("\nStatus: ");
					
					if (tarefa.isConcluirTarefa()) {
						lista.append("Concluída");
					} else {
						lista.append("Pendente");
					}
				}
				JOptionPane.showMessageDialog(null, lista, "", JOptionPane.PLAIN_MESSAGE, null);
				
			} else if (input.equals("3")) {
				
				String nome = JOptionPane.showInputDialog(null, "Qual tarefa deseja deletar: ", "", JOptionPane.QUESTION_MESSAGE);
						
				tarefas.removeIf(tarefa -> tarefa.getNomeTarefa().equalsIgnoreCase(nome));
				
				JOptionPane.showMessageDialog(null, "Tarefa Deletada!", "", JOptionPane.INFORMATION_MESSAGE, null);
			} else if (input.equals("4")) {
				String nome = JOptionPane.showInputDialog(null, "Qual tarefa deseja Concluir?", "", JOptionPane.QUESTION_MESSAGE);
				
				Ex74Agenda tarefa = null;
				
				for (Ex74Agenda t : tarefas) {
					if (t.getNomeTarefa().equalsIgnoreCase(nome)) {
						tarefa = t;
						break;
					}
				}
				if (tarefa != null) {
					tarefa.isConcluirTarefa();
					
					JOptionPane.showMessageDialog(null, "Tarefa Concluída!", "", JOptionPane.INFORMATION_MESSAGE, null);
					tarefa.setConcluirTarefa(true);
				} else {
					JOptionPane.showMessageDialog(null, "Tarefa não encontrada!", "", JOptionPane.INFORMATION_MESSAGE, null);
					tarefa.setConcluirTarefa(false);
				}
			}	else if (input.equals("5")) {
			JOptionPane.showMessageDialog(null, "Saindo...", "", JOptionPane.INFORMATION_MESSAGE, null);
			break;
			}
		}
	}
}

