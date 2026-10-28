package Exnivel5;

public class Node {
	private Integer valor;
	private Node proximovalor;
	
	public Node(Integer valor) {
		super();
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Node getProximovalor() {
		return proximovalor;
	}

	public void setProximovalor(Node proximovalor) {
		this.proximovalor = proximovalor;
	}
	
}
