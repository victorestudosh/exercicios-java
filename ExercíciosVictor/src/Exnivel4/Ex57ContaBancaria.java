package Exnivel4;

public class Ex57ContaBancaria {

	private Ex56Pessoa pessoa;
	private Double preco;
	private Integer id;
	private String cpf;

	public Ex57ContaBancaria(Ex56Pessoa pessoa, Double preco, Integer id, String cpf) {
		super();
		this.pessoa = pessoa;
		this.preco = preco;
		this.id = id;
		this.cpf = cpf;
	}

	public Ex56Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Ex56Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void depositor(Double valor) {
		this.preco += valor;
	}
	
	public void sacar(Double valor) {
		this.preco -= valor;
	}
	
}
