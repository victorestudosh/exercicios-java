package Exnivel4;

public class Ex71 {
	public static void main(String[] args) {
		
		StatusPedido status = StatusPedido.PAGAMENTO_REALIZADO;
		
		System.out.println("Pagamento realizado! ");
		System.out.println("_".repeat(20));
		
		status = StatusPedido.EM_PREPARO;
		
		System.out.println("Status: " + status);
		System.out.println("_".repeat(20));
		
		status = StatusPedido.SAIU_PARA_ENTREGA;
		
		System.out.println("Status: " + status);
		System.out.println("_".repeat(20));
		
		status = StatusPedido.ENTREGUE;
		
		System.out.println("Status: " + status);
	}
}
