package Exnivel4;

public class Ex74Agenda {
	private String nomeTarefa;
	private String data;
	private boolean concluirTarefa = false;

	public Ex74Agenda(String nomeTarefa, String data, boolean concluirTarefa) {
		super();
		this.nomeTarefa = nomeTarefa;
		this.data = data;
		this.concluirTarefa = concluirTarefa;
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isConcluirTarefa() {
		return concluirTarefa;
	}

	public void setConcluirTarefa(boolean concluirTarefa) {
		this.concluirTarefa = concluirTarefa;
	}
}
