package Exnivel4;

public class Ex65Funcionario {
	private String nome;
	private String empresa;
	private String dataContratacao;
	private String salario;
	private Integer cargaHoraria;
	
	public Ex65Funcionario(String nome, String empresa, String dataContratacao, String salario,
			Integer cargaHoraria) {
		super();
		this.nome = nome;
		this.empresa = empresa;
		this.dataContratacao = dataContratacao;
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
	}
	public Ex65Funcionario(String string, String empresa2, int i, String salario2, int cargaHoraria2) {
	}
	public String getNome() {
		return nome;
	}
	public void setPessoa(String pessoa) {
		this.nome = pessoa;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
}
